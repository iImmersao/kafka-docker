package com.iimmersao.KafkaProducerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic.name}")
    private String topicName;

    @PostMapping
    public String sendMessage(@RequestParam("message") String message) {
        kafkaTemplate.send(topicName, message);
        return "Message sent to Kafka: " + message;
    }

    @GetMapping("/check")
    public String check() {
        return "check";
    }

}
