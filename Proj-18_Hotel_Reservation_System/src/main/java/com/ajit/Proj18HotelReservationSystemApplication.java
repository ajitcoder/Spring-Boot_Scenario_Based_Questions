package com.ajit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ajit.service.ReservationService;

@SpringBootApplication
public class Proj18HotelReservationSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Proj18HotelReservationSystemApplication.class, args);
		ReservationService reservationService = ctx.getBean(ReservationService.class);
		reservationService.displayReservationInfo();
		
	}

}
