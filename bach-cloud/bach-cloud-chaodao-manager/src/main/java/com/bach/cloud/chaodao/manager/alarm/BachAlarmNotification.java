package com.bach.cloud.chaodao.manager.alarm;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "bach_alarm_notification")
public class BachAlarmNotification {
    @Id
    @Column(name = "alarm_num")
    private Integer alarmNum;
    @Column(name = "alarm_type")
    private String alarmType;
    @Column(name = "alarm_name")
    private String alarmName;
    @Column(name = "alarm_content")
    private String alarmContent;
    @Column(name = "alarm_remarks")
    private String alarmRemarks;
}
