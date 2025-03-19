package com.iimmersao.KafkaConsumerApp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = "${topic.name}", groupId = "myGroup")
    public void consumeMessage(String message) {
        System.out.println("Message received from Kafka: " + message);
    }
}
