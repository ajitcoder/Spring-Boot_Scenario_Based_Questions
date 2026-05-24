package com.ajit.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "user")
@PropertySource("flightBooking.properties")
@Component
public class User {
	
	  int userId;

	  String userName;

	  Address address;
}
