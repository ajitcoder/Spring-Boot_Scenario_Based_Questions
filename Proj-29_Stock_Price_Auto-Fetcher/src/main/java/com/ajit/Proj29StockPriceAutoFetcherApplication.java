package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Proj29StockPriceAutoFetcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj29StockPriceAutoFetcherApplication.class, args);
	}

}
