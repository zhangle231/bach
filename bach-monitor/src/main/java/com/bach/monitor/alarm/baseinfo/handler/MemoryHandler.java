package com.bach.monitor.alarm.baseinfo.handler;

import com.bach.monitor.alarm.baseinfo.entity.Memory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemoryHandler extends AlarmEntityHandler<Memory> {

    private static Logger log = LoggerFactory.getLogger(MemoryHandler.class);

    private Pattern pTotal = Pattern.compile("MemTotal:\\s+(\\d+) kB");
    private Pattern pFree = Pattern.compile("MemFree:\\s+(\\d+) kB");
    private Pattern pCached = Pattern.compile("Cached:\\s+(\\d+) kB");

    private String match(String line, Pattern pattern) {
        String result = null;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            result = matcher.group(1);
        }
        return result;
    }

    @Override
    public Memory handler(String line, Memory memory) {
        String memTotal = match(line,pTotal);
        String memFree = match(line,pFree);
        String memCached = match(line,pCached);
        if (memTotal != null) memory.setMemTotal(memTotal);
        if (memFree != null) memory.setMemFree(memFree);
        if (memCached != null) memory.setCached(memCached);
        return memory;
    }
}
