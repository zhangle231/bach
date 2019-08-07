package com.bach.monitor.kafka;

import com.bach.monitor.alarm.baseinfo.entity.AlarmEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSendAlarm {
    private static Logger log = LoggerFactory.getLogger(KafkaSendAlarm.class);
    @Autowired
    KafkaTemplate kafkaTemplate;

    public void sendAlarm(AlarmEntity entity) {
        log.info("send alarm: {}",entity);
        kafkaTemplate.send("test",entity);
    }

    @KafkaListener(topics = "test")
    public void processMessage(AlarmEntity entity) {
        log.info("receive message: {}", entity);
    }
}
