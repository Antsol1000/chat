package com.solarsan.chat.controller;

import com.solarsan.chat.service.ReceiverService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1/messages")
public class ReceiverController {

    private final ReceiverService service;

    public ReceiverController(final ReceiverService service) {
        this.service = service;
    }

    @GetMapping
    public List<String> get() {
        return service.get();
    }
}
