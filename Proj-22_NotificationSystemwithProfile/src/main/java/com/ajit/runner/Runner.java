package com.ajit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajit.model.Notification;
import com.ajit.service.NotificationService;
@Component
public class Runner implements CommandLineRunner {
      @Autowired
	NotificationService notificationService;
	
	@Override
	public void run(String... args) throws Exception {
	  notificationService.sendNotification(new Notification(101,"Hello","John"));
	}

}
