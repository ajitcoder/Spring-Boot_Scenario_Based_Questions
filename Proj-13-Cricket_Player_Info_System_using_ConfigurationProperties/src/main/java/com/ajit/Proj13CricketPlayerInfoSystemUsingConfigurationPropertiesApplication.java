package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.service.PlayerService;

@SpringBootApplication
public class Proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication.class, args);
		PlayerService bean = ctx.getBean(PlayerService.class);
		bean.displayPlayerInfo();
	}

}
