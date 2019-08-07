package com.bach.monitor.alarm.baseinfo.handler;

import com.bach.monitor.alarm.baseinfo.entity.UNameInfo;

public class UNameInfoHandler extends AlarmEntityHandler<UNameInfo> {

    @Override
    void init(UNameInfo entity) {

    }

    @Override
    UNameInfo handler(String line, UNameInfo entity) {
        entity.setName(line);
        return entity;
    }
}
