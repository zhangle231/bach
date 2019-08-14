package com.bach.ssm.annotation.service;

import com.bach.ssm.annotation.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
IOC为类型注入，如果有多个bean的话，使用就会报错，
所以要用@Primary来表示默认选择那个。
 */
@Component("roleServiceImpl3")
@Primary
public class RoleServiceImpl3 implements RoleService {

    @Override
    public void printRoleInfo(Role role) {
        System.out.println("role service impl3 " + role);
    }
}
