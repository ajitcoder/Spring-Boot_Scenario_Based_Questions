package com.Service;

import com.model.*;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportScheduler implements ReportService {

	@Autowired
	DailyReport dailyReport;
	@Override
	//@Scheduled(fixedRate = 5000)
	@Scheduled(fixedDelay = 3000)
	public void generateReport() {
		dailyReport.setReportId(101);
		dailyReport.setTitle("Good");
		dailyReport.setGeneratedTime(LocalDateTime.now());
		System.out.println("Report generated at: "+dailyReport.getGeneratedTime());
		System.out.println("Id: "+dailyReport.getReportId()+" Status: "+dailyReport.getTitle());
	}

}
