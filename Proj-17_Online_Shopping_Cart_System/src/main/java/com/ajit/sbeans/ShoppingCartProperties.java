package com.ajit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "cart")
public class ShoppingCartProperties {

	String user;

	double totalAmount;

	int[] quantities;

	List<String> items;

	Set<String> coupons;

	Map<String, Integer> prices;

}
