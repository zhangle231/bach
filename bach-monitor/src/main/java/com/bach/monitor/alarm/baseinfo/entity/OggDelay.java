package com.bach.monitor.alarm.baseinfo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OggDelay extends OggStatus {
    @Override
    public String getAlarmName() {
        return "ogg-delay";
    }

    @Override
    public String getAlarmId() {
        return "1006";
    }

    long seconds;
}
