package com.academysmart.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@NamedQuery(name = "selectAirports", query = "SELECT a FROM Airport a")

public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long AirportID;

	private String name;

	private String city;

	public Airport() {
	}
	

	public long getAirportID() {
		return AirportID;
	}

	public void setAirportID(long AirportID) {
		this.AirportID = AirportID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Airport{" + "AirportID = " + AirportID + ", name = '" + name
				+ '\'' + ", city='" + city + '\'' + '}';
	}
}
