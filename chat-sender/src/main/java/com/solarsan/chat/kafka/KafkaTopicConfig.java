package com.solarsan.chat.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public static final String MAIN_TOPIC_NAME = "main_topic";

    @Bean
    public NewTopic mainTopic() {
        return TopicBuilder.name(MAIN_TOPIC_NAME).build();
    }


}
