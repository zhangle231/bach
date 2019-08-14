package com.bach.ssm.annotation.controller;

import com.bach.ssm.annotation.pojo.Role;
import com.bach.ssm.annotation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoleController2 {
    @Autowired
    @Qualifier("role1")
    Role role = null;

    RoleService roleService = null;

    public RoleController2(@Autowired @Qualifier("roleServiceImpl") RoleService roleService) {
        this.roleService = roleService;
    }

    public void printRole() {
        roleService.printRoleInfo(role);
    }
}
