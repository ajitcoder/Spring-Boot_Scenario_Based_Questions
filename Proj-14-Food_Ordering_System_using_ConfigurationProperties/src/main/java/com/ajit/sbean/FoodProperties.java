package com.ajit.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "food")
@PropertySource("food.properties")
public class FoodProperties {

	private int id;

	private String name;

	private int preparationTime;

	private String restaurantName;
}
