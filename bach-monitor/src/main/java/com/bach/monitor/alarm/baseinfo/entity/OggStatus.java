package com.bach.monitor.alarm.baseinfo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OggStatus extends AlarmEntity {
    @Override
    public String getAlarmName() {
        return "ogg-status";
    }

    @Override
    public String getAlarmId() {
        return "1005";
    }

    @Override
    public String getCmd() {
        String profilePath = "profile";
        if (this.getOs().contentEquals("Linux")) {
            profilePath = "bash_profile";
        }
        return ". ~/." + profilePath + ";cd " + path + ";./ggsci<<EOF\n"
                + "info all\n"
                + "exit\n"
                + "EOF";
    }

    String path = "/opt/ogg/ogg";
}
