package com.example.demolink.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "messages", groupId = "demo-group")
    public void receiveMessage(String message) {
        System.out.println("get message: Kafka");
        System.out.println(message);
        System.out.println("test");
    }
    @KafkaListener(topics = "email-model", groupId = "demo-group")
    public void receiveEmail(String message) {
        System.out.println("get message: email-model");
        System.out.println(message);
    }


}
