package com.zyt.system.interceptor;

import com.zyt.system.util.Const;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname LoginInterceptor
 * @Description 登录拦截器
 * @Date 2023/12/17 13:51
 * @Created by zyt
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contextPath = request.getRequestURI();
        if(!StringUtils.isEmpty(request.getSession().getAttribute(Const.ADMIN))){
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/manager/login");
        return false;
    }
}
