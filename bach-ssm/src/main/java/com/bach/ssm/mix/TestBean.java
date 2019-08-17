package com.bach.ssm.mix;

import com.bach.ssm.annotation.pojo.Role;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

    @Value("${role.role1.name}")
    private String roleName = null;

    @Bean(name = "role4")
    public Role getRole() {
        Role role = new Role();
        role.setId(4l);
        role.setRoleName(roleName);
        role.setNote("note");
        return role;
    }
}
