package com.example.demolink.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicKonfig {
    @Bean
    public NewTopic messageTopic() {
        return TopicBuilder.name("message").partitions(1).replicas(1).build();
    }
    @Bean
    public NewTopic Topic2() {
        return TopicBuilder.name("email-model").partitions(1).replicas(1).build();
    }
    @Bean
    public NewTopic TopicDZ(){
        return TopicBuilder.name("message_DZ").partitions(1).replicas(1).build();
    }


}