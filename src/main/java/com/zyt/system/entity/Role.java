package com.zyt.system.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @Classname Role
 * @Description 角色实体类
 * @Date 2023/12/18 8:34
 * @Created by zyt
 */
@Data
public class Role implements GrantedAuthority {
    private Integer id;
    private String name;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return name;
    }
}
