package com.example.maildelivery.message;

import com.example.maildelivery.dto.request.MailRequest;
import com.example.maildelivery.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessage {

    @Autowired
    private MailService mailService;

    @KafkaListener(topics = "test", groupId = "test-group")
    public void listenTest(String message) {
        System.out.println("message received: " + message);
    }

    @KafkaListener(topics = "otp", groupId = "otp-group")
    public void listen(MailRequest request) {
        mailService.sendOTP(request);
    }


}
