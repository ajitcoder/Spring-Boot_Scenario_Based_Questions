package com.ajit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajit.sbeans.PassengerConfig;

@Component
public class PassengerService {
    @Autowired
    PassengerConfig passenger;
	public void displayPassengerInfo() {
		
		System.out.println("Airline Check-In Details:");
		System.out.println("Passenger ID       : "+passenger.getPassengerId());
		System.out.println("Passenger Name     : "+passenger.getPassengerName());
		System.out.println("Flight No          : "+passenger.getFlight());
		System.out.println("\nSeat Preferences : "+passenger.getSeatPreferences());
		System.out.println("Baggage Weights    : "+passenger.getBaggageWeights());
		System.out.println("Special Help       : "+passenger.getSpecialAssistance());
		System.out.println("Meal Choices       :");
		System.out.println("Meal Choices  = "+passenger.getMeals());
		System.out.println("Travel History     :");
		System.out.println("2022    = "+passenger.getHistory());
		
	}
}
