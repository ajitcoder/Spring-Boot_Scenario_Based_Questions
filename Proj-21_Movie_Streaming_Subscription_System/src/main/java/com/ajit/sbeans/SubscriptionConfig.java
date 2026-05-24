package com.ajit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "subscription")
public class SubscriptionConfig {

	int userId;

	String userName;

	String plan;

	int[] watchTimeHours;

	List<String> genresPreferred;

	Set<String> activeDevices;

	Map<String, Integer> ratings;

	Map<String, String> lastWatched;

	
}
