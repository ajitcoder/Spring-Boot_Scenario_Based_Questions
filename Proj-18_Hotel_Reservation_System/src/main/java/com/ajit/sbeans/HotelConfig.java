package com.ajit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "guest")
public class HotelConfig {
	
	String hotelName;

	String location;

	int guestId;

	String guestName;

	int[] pastRooms;

	List<String> services;

	Set<String> preferences;

	Map<String, Integer> history;


}
