package com.ajit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.sbeans.ShoppingCartProperties;

@Service
public class ShoppingService {
@Autowired
ShoppingCartProperties scp;
	public void displayCartInfo() {
		
		System.out.println("Shopping Cart:");
		System.out.println("User              : "+scp.getUser());
		System.out.println("Total Amount      : "+scp.getTotalAmount());
		System.out.println("\nItem Quantities : "+Arrays.toString(scp.getQuantities()));
		System.out.println("Items (List)      : "+scp.getItems());
		System.out.println("Coupons (Set)     : "+scp.getCoupons());
		System.out.println("Prices (Map)      : ");
		System.out.println("prices (Map)      : "+scp.getPrices());
	}
	
}
