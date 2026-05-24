package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PriceCalculator {

	@Value("1500")
	double bsaePrice;
	
	@Value("#{1500 * 0.18}")
	double gstAmount;
	
	@Value("#{1500 + (1500*0.18) - (1500*0.10)}")
	double discountAmount;
	
	@Value("#{1500 + (1500*0.18) - (1500*0.10)}")
	double finalPrice;
	
}
