package com.bach.cloud.chaodao.manager;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageHandler {

    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        System.out.println(content);
    }
}
