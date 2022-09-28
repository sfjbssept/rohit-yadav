package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.Flight;
import com.flight.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	FlightService service;
	
	
	@RequestMapping("/saveFlight")
	public void saveDetails(@RequestBody Flight inpFlight) {
		 service.saveDetails(inpFlight);
		//return inpFlight;
	}
	
	@GetMapping("/list")
	public Flight getFlight() {
	return	service.getFlight();
	}

}
