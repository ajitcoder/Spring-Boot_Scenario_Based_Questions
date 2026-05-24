package com.ajit.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ajit.model.Notification;
@Profile("prod")
@Component
public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		System.out.println("Seding Push to "+n.getRecipient()+": " +n.getMessage());

	}

}
