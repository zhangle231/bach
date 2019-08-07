package com.bach.monitor.alarm.baseinfo.entity;

import lombok.Data;

@Data
public class SpaceInfo extends AlarmEntity {
    @Override
    public String getAlarmName() {
        return "space-info";
    }

    @Override
    public String getAlarmId() {
        return "1003";
    }

    @Override
    public String getCmd() {
        String cmd = "df ";
        if (os.contentEquals("HP-UX")) {
            cmd = "bdf ";
        }
        cmd += path;
        return cmd;
    }
    String path = "/";
    String usage;
}
