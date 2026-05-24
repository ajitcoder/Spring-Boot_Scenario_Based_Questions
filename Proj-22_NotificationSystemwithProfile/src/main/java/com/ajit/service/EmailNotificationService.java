package com.ajit.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ajit.model.Notification;
@Profile("dev")
@Component
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		System.out.println("Seding email to " + n.getRecipient() + ": " + n.getMessage());

	}

}
