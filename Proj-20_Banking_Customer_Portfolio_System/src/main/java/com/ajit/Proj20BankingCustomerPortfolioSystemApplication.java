package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.CustomerService.CustomerService;

@SpringBootApplication
public class Proj20BankingCustomerPortfolioSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj20BankingCustomerPortfolioSystemApplication.class, args);
		CustomerService bean = ctx.getBean(CustomerService.class);
	    bean.displayCustomerInfo();
	}

}
