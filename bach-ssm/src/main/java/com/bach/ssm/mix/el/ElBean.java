package com.bach.ssm.mix.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("elBean")
public class ElBean {
    @Value("#{role6}")
    private Role6 role6;
    @Value("#{role6.id + 11}")
    private Long id;
    @Value("#{role6.getNote().toString()}")
    private String note;
    @Value("#{T(Math).PI}")
    private double pi;
    @Value("#{T(Math).random()}")
    private double random;
    @Value("#{role6.roleName +'-'+ role6.note}")
    private String str;

    @Override
    public String toString() {
        return "ElBean{" +
                "role6=" + role6 +
                ", id=" + id +
                ", note='" + note + '\'' +
                ", pi=" + pi +
                ", random=" + random +
                ", str='" + str + '\'' +
                '}';
    }
}
