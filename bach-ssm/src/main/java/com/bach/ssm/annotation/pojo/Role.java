package com.bach.ssm.annotation.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//注解的方式创建对象，比较适合生成全局对象，但是如果一个类建多个对象就不方便了。
//@Component("role1")
public class Role {
//    @Value("21")
    private Long id;
//    @Value("role_name_1")
    private String roleName;
    //@Value更强大，@Bean中的变量无法修改
//    @Value("role_note_1")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
