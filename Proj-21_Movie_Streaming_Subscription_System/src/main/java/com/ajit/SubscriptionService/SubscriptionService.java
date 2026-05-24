package com.ajit.SubscriptionService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.SubscriptionConfig;

@Component
public class SubscriptionService {
    
	@Autowired
	SubscriptionConfig subscription;
	
	public void displaySubscriptionInfo() {
		
		System.out.println("Streaming Subscription Details:");
		System.out.println("User ID           : "+subscription.getUserId());
		System.out.println("Plan              : "+subscription.getUserName());
		System.out.println("\nWatch Time (Hrs): "+subscription.getWatchTimeHours());
		System.out.println("Preferred Genres  : "+subscription.getGenresPreferred());
		System.out.println("Active Devices    : "+subscription.getActiveDevices());
		System.out.println("Ratings           : ");
		System.out.println("Ratings       : "+subscription.getRatings());
		System.out.println("Last Watched      :");
		System.out.println("Last Watched  : "+subscription.getLastWatched());
	}
}
