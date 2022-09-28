package com.flight.service;

import com.flight.entity.Flight;

public interface FlightService {

	void saveDetails(Flight inpFlight);

	Flight getFlight();

}
