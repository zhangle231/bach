package com.bach.monitor.alarm.baseinfo.handler;

import com.bach.monitor.alarm.baseinfo.entity.OggStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class OggStatusHandler extends AlarmEntityHandler<OggStatus> {
    @Override
    OggStatus handler(String line, OggStatus entity) {
        if (entity.getStatus()!= null && entity.getStatus().contentEquals("ERROR")) {
            return entity;
        }
        Pattern pattern = Pattern.compile("\\w+\\s+(\\w+)\\s+\\w+\\s+(\\d{2}:\\d{2}:\\d{2}\\s+){2}");
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            String status = matcher.group(1);
            if (!status.contentEquals("RUNNING")) {
                entity.setStatus("ERROR");
                entity.setMsg(line);
                return entity;
            }else {
                entity.setStatus("OK");
                entity.setMsg(null);
                return entity;
            }
        }
        return entity;
    }
}
