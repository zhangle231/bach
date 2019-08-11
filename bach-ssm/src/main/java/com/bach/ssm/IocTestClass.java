package com.bach.ssm;

public class IocTestClass {
    private String name;

    public IocTestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IocTestClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
