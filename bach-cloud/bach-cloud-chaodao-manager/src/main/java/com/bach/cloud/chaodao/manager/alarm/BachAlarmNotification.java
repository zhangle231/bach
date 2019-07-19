package com.bach.cloud.chaodao.manager.alarm;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "bach_alarm_notification")
public class BachAlarmNotification {
    @Id
    @Column(name = "alarm_num")
    private Integer alarmNum;
    @Column(name = "monitor_num")
    private Integer monitorNum;
    @Column(name = "alarm_type")
    private String alarmType;
    @Column(name = "server_ip")
    private String serverIp;
    @Column(name = "alarm_level")
    private String alarmLevel;
    @Column(name = "alarm_name")
    private String alarmName;
    @Column(name = "alarm_content")
    private String alarmContent;
    @Column(name = "alarm_remarks")
    private String alarmRemarks;
    @Column(name = "alarm_protime")
    private Date alarmProtime;

    //monitor_num+alarm_type+server_ip+alarm_name
    public String newTitle() {
        return String.format("%d_%s_%s_%s",monitorNum,alarmType,serverIp,alarmName);
    }

}
