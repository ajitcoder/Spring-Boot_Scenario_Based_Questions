package com.ajit.Scheduler;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ajit.Service.SocialMediaService;
import com.ajit.model.SocialPost;

@Component
public class SocialMediaScheduler implements SocialMediaService {
	
	@Autowired
	SocialPost socialPost;



	@Override
	@Scheduled(fixedDelay = 6000)
	public void autoPostContent() {
		
		socialPost.setPostId(111);
		socialPost.setPostedTime(LocalDateTime.now());
		socialPost.setContent("message");
		
		System.out.println("New post published at: "+socialPost.getPostedTime() );
	}

	@Override
	@Scheduled(fixedRate = 8000)
	public void checkEngagement() {
		
		System.out.println("Checked engagement at: "+socialPost.getPostedTime());
	}

}
