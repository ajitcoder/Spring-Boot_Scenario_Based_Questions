package com.ajit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.DatabaseConfig;

@Component
public class DBService {
@Autowired
DatabaseConfig databaseConfig;

	public void connect() {
		System.out.println(databaseConfig);
	}
}
