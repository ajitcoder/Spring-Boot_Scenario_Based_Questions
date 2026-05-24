package com.ajit;

import com.ajit.sbeans.PassengerConfig;
import com.ajit.service.PassengerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proj19AirlinePassengerCheckInSystemApplication {

    

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj19AirlinePassengerCheckInSystemApplication.class, args);
		PassengerService bean = ctx.getBean(PassengerService.class);
	    bean.displayPassengerInfo();
	
	}

}
