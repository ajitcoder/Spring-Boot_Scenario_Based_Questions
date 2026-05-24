package com.ajit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.PriceCalculator;

@Component
public class BillingService {
	
	@Autowired
	PriceCalculator priceCalculator;
	public void generateBill() {
		System.out.println(priceCalculator);
	}
}
