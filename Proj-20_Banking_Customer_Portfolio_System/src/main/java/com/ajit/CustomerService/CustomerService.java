package com.ajit.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.CustomerConfig;

@Component
public class CustomerService {

	@Autowired
	CustomerConfig customer;

	public void displayCustomerInfo() {

		System.out.println("Customer Portfolio:");
		System.out.println("Account Number     : " + customer.getAccountNo());
		System.out.println("Holder Name        : " + customer.getHolderName());
		System.out.println("Branch             : " + customer.getBranch());
		System.out.println("\nBalances         : " + customer.getBalances());
		System.out.println("Account Types      : " + customer.getAccountTypes());
		System.out.println("Documents          : " + customer.getDocuments());
		System.out.println("Interest Rates   : " + customer.getInterestRates());
		System.out.println("tansaction       : " + customer.getTransactions());

	}

}
