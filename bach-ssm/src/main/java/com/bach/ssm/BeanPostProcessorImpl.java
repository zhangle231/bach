package com.bach.ssm;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
spring 类实例化开始和完成的时候调用这个类的方法
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[" + bean.getClass().getSimpleName() + "]对象" + beanName + "开始实例化");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[" + bean.getClass().getSimpleName() + "]对象" + beanName + "实例化完成");
        return bean;
    }
}
