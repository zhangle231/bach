package com.bach.ssm;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JuiceMaker implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String water;
    private String fruit;
    private String sugar;

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "JuiceMaker{" +
                "water='" + water + '\'' +
                ", fruit='" + fruit + '\'' +
                ", sugar='" + sugar + '\'' +
                '}';
    }

    //实现BeanNameAware
    @Override
    public void setBeanName(String s) {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用BeanNameAware接口的setBeanName方法"
                + "beanName为[" + s + "]");
    }

    //实现BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用BeanFactoryAware接口的setBeanFactory方法"
                + "beanFactory为[" + beanFactory.getClass().getSimpleName() + "]");
    }

    //实现ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用ApplicationContextAware接口的setApplicationContext方法"
                + "applicationContext为[" + applicationContext.getClass().getSimpleName() + "]");

    }

    //实现InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用InitializingBean接口的afterPropertiesSet方法"
        + "对象属性为" + this);

    }

    //实现DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用DisposableBean接口的destroy方法"
                + "对象属性为" + this);

    }

    private String getInfo() {
        return "[" + this.getClass().getSimpleName() + "]";
    }
    //自定义方法-init
    public void init() {
        System.out.println(getInfo() + "执行自定义初始化方法");
    }

    //自定义方法-myDestory
    public void myDestory() {
        System.out.println(getInfo() + "执行自定义销毁方法");
    }
}
