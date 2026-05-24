package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.service.InfoService;

@SpringBootApplication
public class Proj10ProductDiscountCalculationUsingSpelApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj10ProductDiscountCalculationUsingSpelApplication.class, args);
		InfoService bean = ctx.getBean(InfoService.class);
		bean.displayInfo();
	}

}
