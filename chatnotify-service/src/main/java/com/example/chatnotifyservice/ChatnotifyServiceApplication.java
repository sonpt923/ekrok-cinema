package com.example.chatnotifyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class ChatnotifyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatnotifyServiceApplication.class, args);
	}

}
