package com.bach.ssm.annotation.controller;

import com.bach.ssm.annotation.pojo.Role;
import com.bach.ssm.annotation.service.RoleService;
import com.bach.ssm.annotation.service.RoleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoleController {

    @Autowired
    @Qualifier("roleServiceImpl3")
    RoleService roleService = null;

    @Autowired
    @Qualifier("role1")
    Role role = null;

    public void printRole() {
        roleService.printRoleInfo(role);
    }
}
