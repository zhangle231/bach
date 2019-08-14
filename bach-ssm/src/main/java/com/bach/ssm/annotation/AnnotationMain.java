package com.bach.ssm.annotation;

import com.bach.ssm.annotation.config.PojoConfig;
import com.bach.ssm.annotation.controller.RoleController;
import com.bach.ssm.annotation.controller.RoleController2;
import com.bach.ssm.annotation.controller.RoleController3;
import com.bach.ssm.annotation.pojo.Role;
import com.bach.ssm.annotation.service.RoleService;
import com.bach.ssm.annotation.service.RoleService2;
import com.bach.ssm.annotation.service.RoleServiceImpl2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PojoConfig.class);
//        Role role = ctx.getBean(Role.class);
//        RoleService roleService = ctx.getBean(RoleService.class);
//        roleService.printRoleInfo(role);

        RoleController3 roleController = ctx.getBean(RoleController3.class);
        roleController.printRole();
        ctx.close();
    }
}
