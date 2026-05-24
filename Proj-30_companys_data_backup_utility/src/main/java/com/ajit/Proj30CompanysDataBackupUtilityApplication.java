package com.ajit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Proj30CompanysDataBackupUtilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj30CompanysDataBackupUtilityApplication.class, args);
	
		System.out.println("Application started at: "+LocalDateTime.now());
	}

}
