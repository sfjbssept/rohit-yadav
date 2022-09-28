package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	private Integer flightId;
	private String flightNumber;
	private String Sheat;
	private String TNoBSheat;
	private String TNOLSheat;
	private Integer Amount;
	
	

}
