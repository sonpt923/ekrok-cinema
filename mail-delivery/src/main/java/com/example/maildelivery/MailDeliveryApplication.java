package com.example.maildelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class MailDeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailDeliveryApplication.class, args);
    }

}
