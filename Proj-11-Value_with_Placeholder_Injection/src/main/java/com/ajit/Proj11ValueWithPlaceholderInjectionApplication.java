package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.service.DBService;

@SpringBootApplication
public class Proj11ValueWithPlaceholderInjectionApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(Proj11ValueWithPlaceholderInjectionApplication.class, args);){
			
			DBService dbService = ctx.getBean(DBService.class);
			dbService.connect();
		}catch (Exception e) {
		e.printStackTrace();	
		}
	}

}
