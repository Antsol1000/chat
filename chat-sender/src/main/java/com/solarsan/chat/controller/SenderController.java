package com.solarsan.chat.controller;

import com.solarsan.chat.Message;
import com.solarsan.chat.service.SenderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class SenderController {

    private final SenderService service;

    public SenderController(final SenderService service) {
        this.service = service;
    }

    @PostMapping
    public void send(@RequestBody Message message) {
        service.send(message);
    }
}
