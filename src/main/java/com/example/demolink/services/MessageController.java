package com.example.demolink.services;

import com.example.demolink.kafka.MessageProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiMessage")
public class MessageController {
    private final MessageProducer messageProducer;


    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }
    @PostMapping("/sendMessage")
    public void sendMessage(@RequestParam String message){
        messageProducer.sendMessage(message);
    }
    @PostMapping("/sendTopic")
    public void sendTopic(@RequestParam String topic, @RequestParam String message){
        messageProducer.sendTopic(topic, message);
    }


}
