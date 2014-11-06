package com.academysmart.jpa.model;

import javax.persistence.*;

@Entity
@NamedQuery(name = "selectAll", query = "SELECT a FROM Adress a")
public class Adress {

	@Id
	@GeneratedValue
	private long id;
	private String city;
	private String street;

	public Adress() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
