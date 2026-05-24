package com.ajit.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "user.address")
@PropertySource("flightBooking.properties")
@Component
public class Address {
	
	String street;

	 String city;

	 String state;

	 String zipCode;
}
