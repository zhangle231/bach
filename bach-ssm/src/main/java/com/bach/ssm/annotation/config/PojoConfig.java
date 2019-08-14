package com.bach.ssm.annotation.config;

import com.bach.ssm.annotation.pojo.Role;
import com.bach.ssm.annotation.service.RoleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.management.relation.RoleStatus;

//默认扫描当前包
// type-1
//@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl.class})
// type-2
//@ComponentScan(basePackages = { "com.bach.ssm.annotation.pojo",
//                                "com.bach.ssm.annotation.service"})
@ComponentScan(basePackages = {"com.bach.ssm.annotation.pojo",
        "com.bach.ssm.annotation.service", "com.bach.ssm.annotation.controller"}, basePackageClasses = {Role.class, RoleServiceImpl.class})
public class PojoConfig {
    @Bean(name = "role1")
    public Role getRole() {
        Role r = new Role();
        r.setId(22l);
        r.setRoleName("role_name_2");
        r.setNote("role_note_2");
        return r;
    }
    @Bean(name = "role2")
    public Role getRole2() {
        Role r = new Role();
        r.setId(23l);
        r.setRoleName("role_name_3");
        r.setNote("role_note_3");
        return r;
    }
}
