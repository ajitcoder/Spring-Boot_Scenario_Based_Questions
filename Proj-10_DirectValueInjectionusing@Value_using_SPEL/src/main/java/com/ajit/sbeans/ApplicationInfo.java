package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ApplicationInfo
 {
	@Value("Zomato")
	String appName;
   @Value("4.8plus")
	String version;
   @Value("Ajit")
	String developerName;

}
