package com.bach.ssm.annotation.controller;

import com.bach.ssm.annotation.pojo.Role;
import com.bach.ssm.annotation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RoleController3 {
//    @Autowired
//    Role role = null;

    @Autowired
    @Qualifier("role2")
    Role role2 = null;

    RoleService roleService = null;

    public RoleController3(@Autowired @Qualifier("roleServiceImpl") RoleService roleService) {
        this.roleService = roleService;
    }

    public void printRole() {
//        roleService.printRoleInfo(role);
        System.out.println(role2);
    }
}
