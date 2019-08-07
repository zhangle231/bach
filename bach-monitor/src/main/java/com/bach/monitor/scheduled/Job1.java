package com.bach.monitor.scheduled;

import com.bach.monitor.alarm.baseinfo.entity.AlarmEntity;
import com.bach.monitor.controller.AlarmController;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class Job1 extends QuartzJobBean {
    private static final Logger log = LoggerFactory.getLogger(Job1.class);
    @Autowired
    AlarmController alarmController;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("execute");
//        OggStatus entity = new OggStatus();
//        entity.setIp("10.4.16.189");
//        entity.setName("ogg");
//        entity.setPassword("ogg@123");
//        List<AlarmEntity> oggStatuses = alarmController.oggGetAlarm();
//        log.info("ogg-status: {}", oggStatuses);
    }
}
