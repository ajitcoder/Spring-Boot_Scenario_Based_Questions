package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.service.FoodService;

@SpringBootApplication
public class Proj14FoodOrderingSystemUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj14FoodOrderingSystemUsingConfigurationPropertiesApplication.class, args);
		FoodService foodService = ctx.getBean(FoodService.class);
		foodService.displayFoodInfo();
	}

}
