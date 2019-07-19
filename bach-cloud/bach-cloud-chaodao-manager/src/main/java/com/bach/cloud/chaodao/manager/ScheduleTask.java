package com.bach.cloud.chaodao.manager;

import com.bach.cloud.chaodao.manager.alarm.BachAlarmNotification;
import com.bach.cloud.chaodao.manager.chaodao.ZTBug;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
@Configuration
@EnableScheduling
public class ScheduleTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class);
    @Autowired
    RestTemplate restTemplate;

    @Scheduled(cron = "* 0/5 * * * ?")
    private void monitor() {
        log.info("monitor...");
        restTemplate.getForObject("http://localhost:8080/monitor", String.class);
    }

    private void task() {
        Map<String, Object>params = new HashMap<>();
        params.put("title","123");
        ZTBug[] ztBugs = restTemplate.getForObject("http://localhost:8080/findZTBugByTitle?title={title}", ZTBug[].class, params);
        if (ztBugs == null || ztBugs.length < 1) {
            System.out.println("ztBus is null.");
        }
        log.info("ztBugs:{}", ztBugs.length);

        BachAlarmNotification[] bachAlarmNotifications = restTemplate.getForObject("http://localhost:8080/findBachAlarms",
                BachAlarmNotification[].class);
        log.info("bachAlarmNotifications:{}", bachAlarmNotifications.length);
        Set<String> newTitles = new HashSet<>();
        for (BachAlarmNotification b :  bachAlarmNotifications) {
            newTitles.add(b.newTitle());
        }

        for (String title : newTitles) {
            log.info("new title: {}", title);
        }

        ZTBug ztBug = new ZTBug();
        ztBug.setTitle("123123123");
        restTemplate.postForObject("http://localhost:8080/addZTBug",ztBug, ZTBug.class);
    }
}
