package com.ajit.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ajit.model.SystemLog;

@Component
public class DatabaseCleanerScheduler implements LogCleanerService {

	
	@Autowired
	SystemLog log;
	@Override

	public void cleanOldLogs() {
		log.setLogId(102);
		log.setMessage("");
		log.setTimestamp(LocalDateTime.now());
		System.out.println("Id : "+log.getLogId()+" message: "+log.getMessage()+"Time :"+log.getTimestamp());

	}
	@Scheduled(cron = "0/10 38 * * * *")
	public void caller() { 
		cleanOldLogs();
	}

}