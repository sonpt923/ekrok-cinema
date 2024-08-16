package com.example.cinemaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"com.example"})
public class CinemaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaServiceApplication.class, args);
	}

}
