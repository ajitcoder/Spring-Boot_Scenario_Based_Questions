package com.ajit.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BackupInfo {
	
	int backupId;

	String fileName;

	LocalDateTime backupTime;

}
