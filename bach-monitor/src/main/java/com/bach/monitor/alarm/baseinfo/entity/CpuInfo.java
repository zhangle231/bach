package com.bach.monitor.alarm.baseinfo.entity;

import lombok.Data;

@Data
public class CpuInfo extends AlarmEntity{
    @Override
    public String getAlarmName() {
        return "cpu-info";
    }

    @Override
    public String getAlarmId() {
        return "1002";
    }

    @Override
    public String getCmd() {
        return "cat /proc/stat | grep \"cpu \"";
    }

    Float total;
    Float idle;
    Float usage;
}
