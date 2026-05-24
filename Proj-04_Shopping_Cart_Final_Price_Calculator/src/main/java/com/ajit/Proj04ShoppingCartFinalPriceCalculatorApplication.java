package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.sbeans.CartService;

@SpringBootApplication
public class Proj04ShoppingCartFinalPriceCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(Proj04ShoppingCartFinalPriceCalculatorApplication.class, args);){
			
			CartService cartService = ctx.getBean(CartService.class);
			double checkout = cartService.checkout(5000, "ELECTRONICS");
			
			System.out.println("Final price: "+checkout);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
