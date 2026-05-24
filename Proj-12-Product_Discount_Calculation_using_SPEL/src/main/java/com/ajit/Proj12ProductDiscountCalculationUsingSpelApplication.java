package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.ajit.service.BillingService;

@SpringBootApplication
public class Proj12ProductDiscountCalculationUsingSpelApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(Proj12ProductDiscountCalculationUsingSpelApplication.class, args);){
			BillingService billingService = ctx.getBean(BillingService.class);
			billingService.generateBill();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

}
}
