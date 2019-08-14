package com.bach.ssm.annotation.service;

import com.bach.ssm.annotation.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("roleServiceImpl2")
public class RoleServiceImpl2 implements RoleService2 {
    @Autowired
    @Qualifier("role1")
    private Role role = null;

    @Override
    public void printRoleInfo() {
        System.out.println(role);
    }
}
