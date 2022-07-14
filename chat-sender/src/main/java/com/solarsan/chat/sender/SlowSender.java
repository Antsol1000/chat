package com.solarsan.chat.sender;

import com.solarsan.chat.service.SenderService;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Profile("slow")
public class SlowSender extends Sender {

    protected SlowSender(final SenderService service) {
        super(service);
    }

    @Scheduled(fixedDelay = 2000)
    private void send() {
        this.send("Slow Sender");
    }
}
