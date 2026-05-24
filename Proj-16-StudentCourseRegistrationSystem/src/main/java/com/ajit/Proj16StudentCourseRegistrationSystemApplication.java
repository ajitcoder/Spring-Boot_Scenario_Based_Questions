package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.service.StudentService;

@SpringBootApplication
public class Proj16StudentCourseRegistrationSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj16StudentCourseRegistrationSystemApplication.class, args);
		StudentService bean = ctx.getBean(StudentService.class);
		bean.displayStudentInfo();
	}

}
