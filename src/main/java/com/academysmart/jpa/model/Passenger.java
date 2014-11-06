package com.academysmart.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PASSENGER")
@NamedQuery(name = "selectPassengers", query = "select p from Passenger p")
public class Passenger {
	@Id
	@Column(name = "PASSENGERID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long PassengerID;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SURNAME")
	private String surname;
	@Column(name = "PHONE")
	private String phone;

	public Passenger() {
	}

	public Passenger(long PassengerID, String name, String surname, String phone) {
		this.PassengerID = PassengerID;
		this.name = name;
		this.surname = surname;
		this.phone = phone;

	}

	public long getPassengerID() {
		return PassengerID;
	}

	public void setIdpassenger(long PassengerID) {
		this.PassengerID = PassengerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PASSENGER{" + "PassengerID=" + PassengerID + ", name='" + name
				+ '\'' + ", surname='" + surname + '\'' + ", phone='" + phone
				+ '\'' +

				'}';
	}

}
