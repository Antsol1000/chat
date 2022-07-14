package com.solarsan.chat.sender;

import com.solarsan.chat.service.SenderService;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Profile("fast")
public class FastSender extends Sender {

    protected FastSender(final SenderService service) {
        super(service);
    }

    @Scheduled(fixedDelay = 250)
    private void send() {
        this.send("Fast Sender");
    }
}
