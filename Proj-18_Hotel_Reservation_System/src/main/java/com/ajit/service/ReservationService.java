package com.ajit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.sbeans.HotelConfig;

@Service
public class ReservationService {
	
	@Autowired
	HotelConfig hotel;
	
	public void displayReservationInfo() {
		
		System.out.println("Hotel Information:");
		System.out.println("Hotel Name      : "+hotel.getHotelName());
		System.out.println("Location        : "+hotel.getLocation());
	    System.out.println("\nGuest Details:");
	    System.out.println("ID              : "+hotel.getGuestId());
	    System.out.println("Name            : "+hotel.getGuestName());
	    System.out.println("\nPast Rooms    : "+Arrays.toString(hotel.getPastRooms()));
	    System.out.println("Services        : "+hotel.getServices());
	    System.out.println("Preferences     : "+hotel.getPreferences());
	    System.out.println("Visit History   : ");
	    System.out.println("Visit History   : "+hotel.getHistory());
	}	
}
