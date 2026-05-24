package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {
	@Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    @Value("${student.major}")
    private String major;

    @Value("${student.year}")
    private String year;
  @Autowired
   University university;

}
