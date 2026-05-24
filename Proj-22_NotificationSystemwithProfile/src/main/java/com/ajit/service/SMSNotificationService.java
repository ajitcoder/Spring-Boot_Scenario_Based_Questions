package com.ajit.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ajit.model.Notification;
@Profile("test")
@Component
public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		System.out.println("Seding sms to "+n.getRecipient()+": " +n.getMessage());

	}

}
