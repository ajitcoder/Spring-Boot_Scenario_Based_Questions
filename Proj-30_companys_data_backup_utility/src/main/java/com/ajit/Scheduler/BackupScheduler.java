package com.ajit.Scheduler;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ajit.Service.BackupService;
import com.ajit.model.BackupInfo;

@Component
public class BackupScheduler implements BackupService {

	@Autowired
	BackupInfo backupInfo;
	
	
	@Scheduled(cron = "0/10 34 15 * * *")

	@Override
	public void createMorningBackup() {
		backupInfo.setBackupId(111);
		backupInfo.setFileName("xzy");
		backupInfo.setBackupTime(LocalDateTime.now());	
		System.out.println("Backup created: "+backupInfo.getFileName()+" at: "+backupInfo.getBackupTime());
	    System.out.println("ID: "+backupInfo.getBackupId());
	}

	@Scheduled(cron = "0/20 35 15 * * *")

	@Override
	public void createNightBackup() {
		
		
		
		System.out.println("Backup created: in night  "+backupInfo.getFileName()+" at: "+backupInfo.getBackupTime());
	    System.out.println("ID: "+backupInfo.getBackupId());
	
	}

}
