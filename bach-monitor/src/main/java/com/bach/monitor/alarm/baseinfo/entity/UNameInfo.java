package com.bach.monitor.alarm.baseinfo.entity;

import lombok.Data;

@Data
public class UNameInfo extends AlarmEntity{
    @Override
    public String getAlarmName() {
        return "uname";
    }

    @Override
    public String getAlarmId() {
        return "1004";
    }

    @Override
    public String getCmd() {
        return "uname";
    }

    String name;
}
