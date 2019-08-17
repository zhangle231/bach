package com.bach.ssm.mix;

import com.bach.ssm.annotation.controller.RoleController3;
import com.bach.ssm.annotation.pojo.Role;
import com.bach.ssm.mix.el.ElBean;
import com.bach.ssm.mix.el.Role6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AllApplicationConfig.class);
        Role role = ctx.getBean("role1", Role.class);
        System.out.println(role);

        Role role2 = ctx.getBean("role2", Role.class);
        System.out.println(role2);

        Role role3 = ctx.getBean("role3", Role.class);
        System.out.println(role3);

        String name = ctx.getEnvironment().getProperty("role.role1.name");
        System.out.println(name);

        Role role4 = ctx.getBean("role4", Role.class);
        System.out.println(role4);

        Role roleCondition = ctx.getBean("role-condition", Role.class);
        System.out.println(roleCondition);

        /*
            默认情况下，容器只会对一 个bean创建一个实例
            1.*单例   全局唯一（默认）
            2.原型    每次都是新的。
            3.会话    session唯一
            4.请求    请求唯一
         */
        Role roleConditionSame = ctx.getBean("role-condition", Role.class);
        System.out.println(roleCondition == roleConditionSame);


        Role6 role6 = ctx.getBean("role6", Role6.class);
        System.out.println(role6);

        ElBean elBean = ctx.getBean(ElBean.class);
        System.out.println(elBean);
    }
}
