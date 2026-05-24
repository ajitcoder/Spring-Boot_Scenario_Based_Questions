package com.ajit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ajit.model.Vehicle;

@Profile("dev")
@Component
public class BikeService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		
		List <Vehicle> l=new ArrayList<>();
		l.add(new Vehicle(1, "Pulsur", "2 Wheeler"));
		l.add(new Vehicle(2, "Apache", "2 Wheeler"));
		
		return l;
	}

}
