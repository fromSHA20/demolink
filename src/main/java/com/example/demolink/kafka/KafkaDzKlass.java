package com.example.demolink.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaDzKlass {
    public KafkaDzKlass(KafkaTemplate<String, String> kafkaDzKlass) {
        this.kafkaDzKlass = kafkaDzKlass;
    }

    private final KafkaTemplate<String, String> kafkaDzKlass;

    public void sendMessageDZ(String soobhenie) {
        this.kafkaDzKlass.send("TopicDZ", soobhenie);
    }


}
