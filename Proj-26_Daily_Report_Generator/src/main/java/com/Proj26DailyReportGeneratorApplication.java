package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class Proj26DailyReportGeneratorApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(Proj26DailyReportGeneratorApplication.class, args);
	//System.out.println("Main started at: "+LocalDateTime.now());
	}

}
