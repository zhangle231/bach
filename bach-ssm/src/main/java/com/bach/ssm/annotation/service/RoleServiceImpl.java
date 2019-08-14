package com.bach.ssm.annotation.service;

import com.bach.ssm.annotation.pojo.Role;
import com.bach.ssm.annotation.service.RoleService;
import org.springframework.stereotype.Component;

@Component("roleServiceImpl")
public class RoleServiceImpl implements RoleService {
    public void printRoleInfo(Role role) {
        System.out.println(role);
    }
}
