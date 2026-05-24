package com.ajit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "airline")
public class PassengerConfig {

	int passengerId;

	String passengerName;

	String flight;

	List<String> seatPreferences;

	double[] baggageWeights;

	Set<String> specialAssistance;

	Map<String, String> meals;

	Map<String, Integer> history;
}
