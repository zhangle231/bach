package com.bach.ssm.mix.condition;

import com.bach.ssm.annotation.pojo.Role;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ConditionBean {

    @Bean(name = "role-condition")
    @Conditional(RoleCondition.class)
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Role getConditionRole() {
        Role role = new Role();
        role.setId(6l);
        role.setRoleName("role-name-condition");
        role.setNote("role-note-condition");
        return role;
    }

}
