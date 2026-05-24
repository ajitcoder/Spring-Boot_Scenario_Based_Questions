package com.ajit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "flight")
@PropertySource("classpath:flightBooking.properties")
public class FlightProperties {
	@Autowired
	Flight flight;
	
	@Autowired
	User user;

}
