package com.bach.ssm.mix;

import com.bach.ssm.annotation.pojo.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class ProfileSource {

    @Bean(name = "role3")
    @Profile("dev")
    public Role getDevRole3() {
        Role role = new Role();
        role.setId(3l);
        role.setRoleName("role-name-3");
        role.setNote("role-note-3");
        return role;
    }

    @Bean(name = "role3")
    @Profile("test")
    public Role getTestRole3() {
        Role role = new Role();
        role.setId(3l);
        role.setRoleName("test-role-name-3");
        role.setNote("test-role-note-3");
        return role;
    }
}
