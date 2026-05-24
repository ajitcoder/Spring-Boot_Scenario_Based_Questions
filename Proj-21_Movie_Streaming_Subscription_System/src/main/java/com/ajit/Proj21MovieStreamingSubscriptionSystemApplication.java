package com.ajit;

import com.ajit.SubscriptionService.SubscriptionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proj21MovieStreamingSubscriptionSystemApplication {

    

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj21MovieStreamingSubscriptionSystemApplication.class, args);
		
		SubscriptionService bean = ctx.getBean(SubscriptionService.class);
		bean.displaySubscriptionInfo();
	}

}
