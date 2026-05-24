package com.ajit.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "flight")
@PropertySource("flightBooking.properties")
@Component
public class Flight {

	String number;

	String departureCity;

	String destinationCity;

	double ticketPrice;
}
