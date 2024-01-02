package com.zyt.system.service;

import com.zyt.system.entity.Admin;
import com.zyt.system.util.PageBean;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;

/**
 * @Classname AdminService
 * @Description None
 * @Date 2023/12/21 12:20
 * @Created by zyt
 */
public interface AdminService extends UserDetailsService {

    Admin login(String username, String password);

    PageBean<Admin> queryPage(Map<String, Object> paramMap);

    int insertAdmin(Admin admin);

    Admin selectById(Integer id);

    int delByAdminIds(List<Integer> ids);

    int editByAdmin(Admin admin);

    Admin selectByName(String username);

    Admin selectByEmail(String email);
}
