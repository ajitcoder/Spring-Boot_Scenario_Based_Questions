package com.ajit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix = "student")
public class StudentConfig {

int studentId;

String studentName;

String department;

int[] marks;

List<String> courses;

Set<String> skills;

Map<String, Double> cgpa;


}
