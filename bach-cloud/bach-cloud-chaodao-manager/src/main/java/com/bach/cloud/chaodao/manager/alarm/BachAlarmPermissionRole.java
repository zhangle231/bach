package com.bach.cloud.chaodao.manager.alarm;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/*
+-----------------+-------------+------+-----+---------+-------+
| Field           | Type        | Null | Key | Default | Extra |
+-----------------+-------------+------+-----+---------+-------+
| role_id         | int(10)     | NO   | PRI | NULL    |       |
| monitor_num     | int(11)     | NO   | PRI | NULL    |       |
| employee_num    | varchar(32) | NO   | PRI | NULL    |       |
| alarm_level     | varchar(32) | NO   |     | NULL    |       |
| valid           | bit(1)      | NO   |     | NULL    |       |
| last_noticetime | datetime    | YES  |     | NULL    |       |
| create_time     | datetime    | YES  |     | NULL    |       |
| notify_style    | varchar(64) | YES  |     | NULL    |       |
+-----------------+-------------+------+-----+---------+-------+
 */
@Data
@Entity
@Table(name = "bach_alarm_permission_role")
@IdClass(BachAlarmPermissionRoleKey.class)
public class BachAlarmPermissionRole implements Serializable {
    @Id
    @Column(name = "role_id")
    Integer roleId;
    @Id
    @Column(name = "monitor_num")
    Integer monitorNum;
    @Id
    @Column(name = "employee_num")
    String EmployeeNum;
    @Column(name = "alarm_level")
    String alarmLevel;
    @Column(name = "valid")
    Byte valid;
    @Column(name = "last_noticetime")
    Date LastNoticetime;
    @Column(name = "create_time")
    Date creatTime;
    @Column(name = "notify_style")
    String notifyStyle;


}
