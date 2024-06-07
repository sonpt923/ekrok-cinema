package com.example.scheduleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
//@EnableDiscoveryClient
public class ScheduleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleServiceApplication.class, args);
	}

}
