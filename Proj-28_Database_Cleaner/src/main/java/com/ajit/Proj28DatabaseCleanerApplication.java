package com.ajit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Proj28DatabaseCleanerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj28DatabaseCleanerApplication.class, args);
	  
		System.out.println("Main Started at: "+LocalDateTime.now());
	}

}
