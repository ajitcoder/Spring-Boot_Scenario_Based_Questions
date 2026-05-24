package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Fuel {
   @Value("${fuel.type}")
   String fueltype;
   @Value("${fuel.quality}")
   String quality;
   @Value("${fuel.rate}")
   Integer fuelrate;
	
}
