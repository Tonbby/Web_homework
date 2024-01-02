package com.zyt.system.handler;

import com.alibaba.fastjson.JSON;
import com.zyt.system.config.ReloadSecuritySource;
import com.zyt.system.entity.Admin;
import com.zyt.system.entity.Role;
import com.zyt.system.service.RoleService;
import com.zyt.system.util.AjaxResult;
import com.zyt.system.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

/**
 * @Auther: zyt
 * @Date: 2023/12/30 15:04
 * @Description:
 */
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private AjaxResult ajaxResult;

    @Autowired
    private RoleService roleService;

    @Autowired
    private ReloadSecuritySource reloadSecuritySource;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        HttpSession session = request.getSession();
        Admin ad = (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        session.setAttribute(Const.ADMIN,ad);
        //获取角色列表，存入session
        if(session.getAttribute(Const.ROLE) == null){
            List<Role> roleList = roleService.selectAll();
            session.setAttribute(Const.ROLE,roleList);
        }

        // 装载权限
        //reloadSecuritySource.getReloadSecuritySource();
        ajaxResult.ajaxTrue("登录成功");
        String json = JSON.toJSONString(ajaxResult);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
