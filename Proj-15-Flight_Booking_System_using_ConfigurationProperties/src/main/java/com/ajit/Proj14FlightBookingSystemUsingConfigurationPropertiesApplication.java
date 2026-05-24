package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.sbean.FlightProperties;

@SpringBootApplication
public class Proj14FlightBookingSystemUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj14FlightBookingSystemUsingConfigurationPropertiesApplication.class, args);
		FlightProperties flightProperties = run.getBean(FlightProperties.class);
		System.out.println(flightProperties);
	}

}
