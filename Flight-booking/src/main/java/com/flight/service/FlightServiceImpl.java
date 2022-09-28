package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entity.Flight;
import com.flight.repo.FlightRepo;

@Service
public class FlightServiceImpl implements FlightService{

	
	@Autowired
	FlightRepo repo;
	@Override
	public void saveDetails(Flight inpFlight) {
		// TODO Auto-generated method stub
		repo.save(inpFlight);
		
	}
	@Override
	public Flight getFlight() {
		// TODO Auto-generated method stub
		Integer id =1;
		return repo.getOne(id);
	}

}
