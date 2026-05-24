package com.ajit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ajit.model.Vehicle;

@Profile("test")
@Component
public class CarService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		
		List <Vehicle> l=new ArrayList<>();
		l.add(new Vehicle(1, "Swift", "4 Wheeler"));
		l.add(new Vehicle(2, "Innova", "4 Wheeler"));
		return l;
	}

}
