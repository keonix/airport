package com.academysmart.jpa.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;
	private String fname;
	private String lname;
	@OneToOne(targetEntity = Adress.class)
	@JoinColumn(name = "adr_fk")
	private Adress adress;
	@ElementCollection
	@CollectionTable(name = "phone_numbers")
	@MapKeyColumn(name = "style")
	@Column(name = "number")
	Map<String, String> phoneNumbers = new HashMap<String, String>();;

	public Employee() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Map<String, String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Map<String, String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
