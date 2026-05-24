package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.sbeans.StudentReportService;

@SpringBootApplication
public class Proj05StudentMarksCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(Proj05StudentMarksCalculatorApplication.class, args);){
			
			StudentReportService studentReportService = ctx.getBean(StudentReportService.class);
			studentReportService.printReport("Rajesh", 94, 89, 90);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}