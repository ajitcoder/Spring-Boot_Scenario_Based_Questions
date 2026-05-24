package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Motor {
@Value("${motor.type}")	
String motortype;
@Value("${motor.power}")	
Integer motorpower;
@Autowired
Fuel fuel;
}
