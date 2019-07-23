package com.bach.cloud.chaodao.manager.alarm;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "bach_alarm_role")
public class BachAlarmRole {
    @Id
    @Column(name = "role_id")
    Integer roleId;
    @Column(name = "role_name")
    String roleName;
    @Column(name = "create_time")
    Date createTime;
    @Column(name = "valid")
    Byte valid;
}
