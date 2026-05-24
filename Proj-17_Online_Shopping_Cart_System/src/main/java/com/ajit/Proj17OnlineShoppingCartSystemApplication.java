package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.service.ShoppingService;

@SpringBootApplication
public class Proj17OnlineShoppingCartSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj17OnlineShoppingCartSystemApplication.class, args);
	
		ShoppingService shoppingService = ctx.getBean(ShoppingService.class);
	    shoppingService.displayCartInfo();
	}

}
