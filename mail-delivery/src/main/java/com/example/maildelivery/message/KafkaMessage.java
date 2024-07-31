package com.example.maildelivery.message;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessage {

    @KafkaListener(topics = "", groupId = "")
    public void listen(String message) {
        System.out.println(message);
    }



}
