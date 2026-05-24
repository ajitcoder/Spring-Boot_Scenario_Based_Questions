package com.ajit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class Proj24EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj24EmployeeManagementSystemApplication.class, args);
	}

}
