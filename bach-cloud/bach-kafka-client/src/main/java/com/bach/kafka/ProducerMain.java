package com.bach.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerMain {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "10.4.1.186:9092");
        props.put("acks", "all");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 100; i++)
            producer.send(new ProducerRecord<String, String>("test", Integer.toString(i), "test-message-" + Integer.toString(i)));

        System.out.println("send complete.");
        producer.close();
        System.out.println("close complete.");
    }
}
