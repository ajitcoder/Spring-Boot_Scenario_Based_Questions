package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.sbeans.Motor;

@SpringBootApplication
public class Proj06MotoFuelSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj06MotoFuelSystemApplication.class, args);
		       Motor bean = ctx.getBean(Motor.class);
		  System.out.println(bean);    
		       
	}

}
