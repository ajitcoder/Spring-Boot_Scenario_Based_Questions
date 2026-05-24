package com.ajit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "customer")
public class CustomerConfig {
	
	long accountNo;

	String holderName;

	String branch;

	double[] balances;

	List<String> accountTypes;

	Set<String> documents;

	Map<String, Double> interestRates;

	Map<String, Integer> transactions;


	
	

}
