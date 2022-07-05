package com.solarsan.chat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReceiverService {

    private static final Logger log = LoggerFactory.getLogger(ReceiverService.class);

    private final List<String> messages;

    public ReceiverService() {
        messages = new ArrayList<>();
    }

    public void save(final String message) {
        log.info("Received Message: " + message);
        messages.add(message);
        log.info("Message saved");
    }

    public List<String> get() {
        return List.copyOf(messages);
    }
}
