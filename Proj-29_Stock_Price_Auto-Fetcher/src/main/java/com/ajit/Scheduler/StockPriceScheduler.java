package com.ajit.Scheduler;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ajit.model.StockPrice;
import com.ajit.service.StockService;
@Component
public class StockPriceScheduler implements StockService {
	
	@Autowired
	StockPrice stockPrice;
	
	@Scheduled(fixedRate = 4000)
	@Override
	public void fetchLatestPrice() {
		
		stockPrice.setCurrentPrice(10000);
		stockPrice.setStockId(121);
		stockPrice.setStockName("Ajit");
		stockPrice.setFetchedTime(LocalDateTime.now());
		
		System.out.println("Fetched price for:  <"+stockPrice.getStockName()+" >:" +stockPrice.getCurrentPrice());
		System.out.println("At ID: "+stockPrice.getStockId());
		System.out.println("At time: "+stockPrice.getFetchedTime());

	}

}
