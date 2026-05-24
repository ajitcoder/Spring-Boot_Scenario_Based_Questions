package com.model;


import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class DailyReport {

	
	private int reportId;
	
	private String title;
	
	private LocalDateTime generatedTime;
}
