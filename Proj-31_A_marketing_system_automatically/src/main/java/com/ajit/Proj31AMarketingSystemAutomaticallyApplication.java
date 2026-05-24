package com.ajit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Proj31AMarketingSystemAutomaticallyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj31AMarketingSystemAutomaticallyApplication.class, args);
	
		System.out.println("Application started at: "+LocalDateTime.now());
	}

}
