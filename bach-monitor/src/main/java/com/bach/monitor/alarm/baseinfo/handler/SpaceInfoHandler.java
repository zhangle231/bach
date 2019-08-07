package com.bach.monitor.alarm.baseinfo.handler;

import com.bach.monitor.alarm.baseinfo.entity.SpaceInfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceInfoHandler extends AlarmEntityHandler<SpaceInfo> {
    @Override
    SpaceInfo handler(String line, SpaceInfo entity) {
        if (entity.getOs().contentEquals("Linux")) {
            Pattern p = Pattern.compile("(\\d+)%");
            Matcher matcher = p.matcher(line);
            if (matcher.find()) {
                String usage = matcher.group(1);
                entity.setUsage(usage);
            }
        }
        return entity;
    }
}
