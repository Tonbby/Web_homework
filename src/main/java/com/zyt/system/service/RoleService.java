package com.zyt.system.service;

import com.zyt.system.entity.Role;
import com.zyt.system.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname RoleService
 * @Description None
 * @Date 2023/12/18 8:35
 * @Created by zyt
 */
public interface RoleService {
    List<Role> selectAll();

    PageBean<Role> queryPage(Map<String, Object> paramMap);

    int delByRoleIds(List<Integer> ids);

    Role selectById(Integer id);

    Role selectByName(String name);

    int editByRole(Role role);

    int insertRole(Role role);
}
