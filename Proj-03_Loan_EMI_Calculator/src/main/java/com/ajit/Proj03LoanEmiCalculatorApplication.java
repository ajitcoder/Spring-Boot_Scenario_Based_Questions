package com.ajit;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.ajit.sbeans.LoanCalculator;

@SpringBootApplication
public class Proj03LoanEmiCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(Proj03LoanEmiCalculatorApplication.class, args);){
			
			LoanCalculator loanCalculator = ctx.getBean(LoanCalculator.class);
			
			System.out.println("Total EMI Amount: "+loanCalculator.generateFinalAmount(500000, "vehicle", 6));
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}