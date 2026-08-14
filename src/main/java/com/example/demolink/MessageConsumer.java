package com.example.demolink;

import org.springframework.kafka.annotation.KafkaListener;

public class MessageConsumer {
    @KafkaListener(topics = "messages", groupId = "demo-group")

    public void receiveMessage(String message) {
        System.out.println("получено сообщение от KAFKA");
        System.out.println(message);
    }


}
