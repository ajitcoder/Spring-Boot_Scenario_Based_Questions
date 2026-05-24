package com.ajit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ajit.model.Vehicle;

@Profile("prod")
@Component
public class TruckService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		
		List <Vehicle> l=new ArrayList<>();
		l.add(new Vehicle(1, "Tata Truck", "10 Wheeler"));
		l.add(new Vehicle(2, "Ashok Leyland", "10 Wheeler"));
		return l;
		
	}

}
