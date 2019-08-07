package com.bach.monitor.alarm.baseinfo.entity;

import lombok.Data;

@Data
public abstract class AlarmEntity {
    public abstract String getAlarmName();
    public abstract String getAlarmId();
    public abstract String getCmd();

    String ip;
    String name;
    String password;
    String status;
    String msg;
    String os;
}
