package com.solarsan.chat.kafka;

import static com.solarsan.chat.kafka.KafkaTopics.MAIN_TOPIC;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {

    @Bean
    public NewTopic mainTopic() {
        return TopicBuilder.name(MAIN_TOPIC).build();
    }

}
