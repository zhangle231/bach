package com.bach.monitor.alarm.baseinfo.handler;

import com.bach.monitor.alarm.baseinfo.entity.OggDelay;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OggDelayHandler extends AlarmEntityHandler<OggDelay> {
    @Override
    OggDelay handler(String line, OggDelay entity) {
        if (entity.getStatus()!= null && entity.getStatus().contentEquals("ERROR")) {
            return entity;
        }
        Pattern pattern = Pattern.compile("\\w+\\s+\\w+\\s+\\w+\\s+(\\d{2}:\\d{2}:\\d{2}\\s+)(\\d{2}:\\d{2}:\\d{2}\\s+)");
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            String[] durations = new String[2];
            durations[0] = matcher.group(1).trim();
            durations[1] = matcher.group(2).trim();

            Duration max = null;
            for (String d : durations) {
                String[] split = d.split(":");
                String format = String.format("PT%sH%sM%sS", split[0], split[1], split[2]);
                Duration duration = Duration.parse(format);
                if (max == null || max.getSeconds() < duration.getSeconds()) {
                    max = duration;
                }
            }
            long max2 = Math.max(entity.getSeconds(), max.getSeconds());
            if (max2 != entity.getSeconds()) {
                entity.setSeconds(max2);
                entity.setMsg(line);
            }
        }
        return entity;
    }
}
