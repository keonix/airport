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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "selectFlights", query = "SELECT f FROM Flight f")
@Table(name = "FLIGHT")
public class Flight {
	@Id
	@Column(name = "FlightID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long FlightID;
	@ManyToOne
	@JoinColumn(name = "RaceID", referencedColumnName = "RaceID")
	private Race race;
	
	
	@Column(name = "DATE")
	private Date time;
	@Column(name = "FirstClass")
	private Integer firstClass;
	@Column(name = "SecondClass")
	private Integer secondClass;
	@Column(name = "ThirdClass")
	private Integer thirdClass;


	public Flight() {
	}
	
	
	
	public Flight (long FlightID, Date time, Race race,  Integer firstClass, 
			Integer secondClass, Integer thirdClass){
		this.FlightID = FlightID;
		this.time = time;
		this.race = race;
		
		this.firstClass =  firstClass;
		this.secondClass = secondClass;
		this.thirdClass = thirdClass;
	
		}

	public long getFlightID() {
		return FlightID;
	}

	public void setFlightID(long FlightID) {
		this.FlightID = FlightID;

	}
	
	public Date getTime(){
		return time;
	}
	
	public void setTime(Date time){
		this.time = time;
	}
	public Race getRace(){
		return race;
	}
	
	public void setRace(Race race){
		this.race = race;
	}
	public Integer getFirstClass(){
		return firstClass;
	}
	
	public void setFirstClass(Integer firstClass){
		this.firstClass = firstClass;
	}
	public Integer getSecondClass(){
		return secondClass;
	}
	public void setSecondClass(Integer secondClass){
		this.secondClass = secondClass;
	}
	public Integer getThirdClass(){
		return thirdClass;
	}
	public void setThirdClass(Integer  thirdClass){
		this.thirdClass = thirdClass;
	}

	public String toString() {
		return "Flight{" + "FlightID = " + FlightID + ", Date = '" + time
				+ ", firstClass='" + firstClass + '\'' + 
				", secondClass='" + secondClass + '\'' +
				", thirdClass='"+ thirdClass + '\'' +
				", race =" +race + '}'
							;
	}
	
}
