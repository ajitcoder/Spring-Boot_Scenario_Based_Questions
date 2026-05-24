package com.ajit.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ajit.model.Reminder;

@Component
public class ReminderScheduler implements ReminderService {

	
	 @Autowired
	 Reminder reminder;
	
	@Override
	@Scheduled(cron = "10/15 25 15 * * *")
	public void sendMorningReminder() {
		reminder.setId(1001);
		reminder.setMessage("Good Morning ");
		reminder.setUserEmail("ajit@mail.com");
		System.out.println("Good Morning at: "+LocalDateTime.now());

	}

	@Override
	@Scheduled(cron = "0/12 24 15 * * *")
	public void sendEveningReminder() {
		reminder.setId(1001);
		reminder.setMessage("Good Morning ");
		reminder.setUserEmail("ajit@mail.com");
		System.out.println("good Evening at: "+LocalDateTime.now());
		
	}

}
