package com.solarsan.chat.service;

import static com.solarsan.chat.kafka.KafkaTopicConfig.MAIN_TOPIC_NAME;

import com.solarsan.chat.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    private static final Logger log = LoggerFactory.getLogger(SenderService.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    public SenderService(final KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(final Message message) {
        log.info("Start sending Message " + message);
        kafkaTemplate.send(MAIN_TOPIC_NAME, message.content());
        log.info("Send Message " + message);
    }
}
