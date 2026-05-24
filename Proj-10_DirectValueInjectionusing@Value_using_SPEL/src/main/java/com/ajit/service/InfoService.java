package com.ajit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.ApplicationInfo;

import lombok.Data;

@Component
public class InfoService {
	@Autowired
	ApplicationInfo appinfo;

	public void displayInfo() {
		System.out.println("App Name: " + appinfo.getAppName());
		System.out.println("Version: "+ appinfo.getVersion());
		System.out.println("DeveloperName: " +appinfo.getDeveloperName());
	}
}
