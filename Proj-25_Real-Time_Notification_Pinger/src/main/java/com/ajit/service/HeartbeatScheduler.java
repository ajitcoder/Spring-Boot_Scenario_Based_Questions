package com.ajit.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ajit.model.Heartbeat;

@Component
public class HeartbeatScheduler implements HeartbeatService {

	@Autowired
	Heartbeat heartbeat;
	
	@Override
	@Scheduled(fixedDelay = 3000)
	public void sendPing() {
		heartbeat.setId(101);
		heartbeat.setStatus("Good Ajit");
		heartbeat.setTimestamp(LocalDateTime.now());
		System.out.println("Id : "+heartbeat.getId()+" Status : "+heartbeat.getStatus());
		System.out.println( "Ping sent at <"+heartbeat.getTimestamp()+">");

	}

}
