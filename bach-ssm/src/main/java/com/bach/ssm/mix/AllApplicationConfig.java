package com.bach.ssm.mix;

import org.springframework.context.annotation.Import;

/*
    装配的混合使用例子
    controller由注解装配
    pojo对象由xml装配
 */
@Import({XmlConfig.class, AnnotationApplicationConfig.class, PropertyConfig.class})
public class AllApplicationConfig {
}
