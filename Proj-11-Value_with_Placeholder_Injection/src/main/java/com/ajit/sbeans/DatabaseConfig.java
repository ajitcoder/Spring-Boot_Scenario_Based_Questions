package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DatabaseConfig {
	@Value("${db.url}")
	String url;

	@Value("${db.username}")
	String username;

	@Value("${db.password}")
	String password;
	
	
}
