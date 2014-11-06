package com.academysmart.jpa.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "RACE")
@NamedQuery(name = "selectRaces", query = "select r from Race r")
public class Race {
	@Id
	@Column(name = "RaceID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long RaceID;
	@Column(name = "fromCity")
	private String fromCity;
	@Column(name = "toCity")
	private String toCity;

	@Column(name = "TIME")
	private String time;

	@Column(name = "price")
	private double price;
	@Column(name = "TypeOfLuxury")
	private String TypeOfLuxury;

	@ManyToOne
	@JoinColumn(name = "FlightTypeID", referencedColumnName = "FlightTypeID")
	private FlightType flightType;

	public Race() {

	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTypeOfLuxury() {
		return TypeOfLuxury;
	};

	public void setTypeOfLuxury(String TypeOfLuxury) {
		this.TypeOfLuxury = TypeOfLuxury;
	}

	public long getRaceID() {
		return RaceID;
	}

	public void setRaceID(long RaceID) {
		this.RaceID = RaceID;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FlightType getFlightType() {
		return flightType;
	}

	public void setFlightType(FlightType flightType) {
		this.flightType = flightType;
	}

	@Override
	public String toString() {
		return "Race{" + "RaceID=" + RaceID + ", fromCity='" + fromCity + '\''
				+ ", toCity='" + toCity + '\'' +
				", Time = '" + time
				+ ", price=" + price + ", FlightType=" + flightType + '}';

	}
}
