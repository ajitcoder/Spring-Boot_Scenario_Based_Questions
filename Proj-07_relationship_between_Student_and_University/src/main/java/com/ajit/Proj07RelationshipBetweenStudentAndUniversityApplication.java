package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.sbeans.Student;

@SpringBootApplication
public class Proj07RelationshipBetweenStudentAndUniversityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj07RelationshipBetweenStudentAndUniversityApplication.class, args);
		Student bean = ctx.getBean(Student.class);
		System.out.println(bean);
	}

}
