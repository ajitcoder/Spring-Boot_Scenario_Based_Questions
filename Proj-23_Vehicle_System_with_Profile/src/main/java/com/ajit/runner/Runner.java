package com.ajit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajit.model.Vehicle;
import com.ajit.service.VehicleService;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	VehicleService vehicle;
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Vehicle> vehicles = vehicle.getVehicles();
		//System.out.println(vehicles);
		vehicles.forEach(System.out::println);
	}

}
