package com.academysmart.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "selectFlightTypes", query = "SELECT ft FROM FlightType ft")
@Table(name = "FLIGHTTYPE")
public class FlightType {
	@Id
	@Column(name = "FLIGHTTYPEID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long FlightTypeID;
	@Column(name = "Class")
	private String Class;

	@Column(name = "ClassContango")
	private Integer ClassContango;

	public FlightType() {

	}

	public int getClassContango() {
		return ClassContango;
	}

	public void setClassContango(int ClassContango) {
		this.ClassContango = ClassContango;
	}

	public long getFlightTypeID() {
		return FlightTypeID;
	}

	public void setFlightTypeID(long FlightTypeID) {
		this.FlightTypeID = FlightTypeID;
	}

	@Override
	public String toString() {
		return "FlightType{" + " FlightTypeID=" + FlightTypeID + ", Class='"
				+ Class + '\'' + ", ClassContango='" + ClassContango + '\''
				+ '}';
	}
}
