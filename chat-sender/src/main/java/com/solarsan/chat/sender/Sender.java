package com.solarsan.chat.sender;

import com.solarsan.chat.Message;
import com.solarsan.chat.service.SenderService;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Sender {

    private final SenderService service;
    private final AtomicInteger counter;

    protected Sender(final SenderService service) {
        this.service = service;
        this.counter = new AtomicInteger(-1);
    }

    protected void send(final String name) {
        service.send(new Message(
                "This is message number %d send by %s".formatted(counter.incrementAndGet(), name)));
    }
}
