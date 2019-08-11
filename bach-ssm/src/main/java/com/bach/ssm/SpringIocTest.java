package com.bach.ssm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {
    public static void main(String[] args) {
        /*
        通过ctx可以获取类实例
         */
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        JuiceMaker juiceMaker = (JuiceMaker) ctx.getBean("juiceMaker");
        IocTestClass iocTestClass = (IocTestClass) ctx.getBean("iocTestClass");
        IocTestClass2 iocTestClass2 = (IocTestClass2) ctx.getBean("iocTestClass2");
        System.out.println(iocTestClass);
        System.out.println(iocTestClass2);
        ctx.close();
    }
}
