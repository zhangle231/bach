package com.bach.monitor.alarm.baseinfo.entity;

import lombok.Data;

@Data
public class Memory extends AlarmEntity{
    @Override
    public String getAlarmName() {
        return "memory";
    }

    @Override
    public String getAlarmId() {
        return "1001";
    }

    @Override
    public String getCmd() {
        return "cat /proc/meminfo";
    }

    //内存总大小
    String memTotal;
    //内存空闲
    String memFree;
    // Cache
    String Cached;

    public float getUsed() {
        float total = Float.valueOf(memTotal);
        float free = Float.valueOf(memFree);
        float cached = Float.valueOf(Cached);
        float tmp = (1f - ((free + cached) / total));
        return Math.round((1.000000 - ((free + cached) / total)) * 100);
    }
}
