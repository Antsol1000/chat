package com.solarsan.chat.kafka;


import static com.solarsan.chat.kafka.KafkaTopics.MAIN_TOPIC;

import com.solarsan.chat.service.ReceiverService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    private final ReceiverService service;

    public KafkaListeners(final ReceiverService service) {
        this.service = service;
    }

    @KafkaListener(topics = MAIN_TOPIC, groupId = "0")
    void listener(final String message) {
        service.save(message);
    }
}

