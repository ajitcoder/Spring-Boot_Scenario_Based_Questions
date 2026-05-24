package com.ajit.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Reminder {

	private int id;
	private String userEmail;
	private String message;
}
