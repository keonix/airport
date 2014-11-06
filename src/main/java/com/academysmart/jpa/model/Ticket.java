package com.academysmart.jpa.model;

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
@NamedQuery(name = "selectTickets", query = "SELECT t FROM Ticket t")
@Table(name = "TICKET")
public class Ticket {
	@Id
	@Column(name = "TICKETID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ticketID;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "BAGGAGE")
	private double baggage;
	@Column(name = "TYPE")
	private String type;


	@ManyToOne
	@JoinColumn(name = "PASSENGER_PASSENGERID", referencedColumnName = "PASSENGERID")
	private Passenger passenger;

	@ManyToOne
	@JoinColumn(name = "AIRPORT_AIRPORTID", referencedColumnName = "AIRPORTID")
	private Airport airport;

	@ManyToOne
	@JoinColumn(name = "RACE_RACEID", referencedColumnName = "RACEID")
	private Race race;

	public Ticket() {
	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getTicketID() {
		return ticketID;
	}

	public void setTicketID(long ticketID) {
		this.ticketID = ticketID;
	}

	public double getBaggage() {
		return baggage;
	}

	public void setBaggage(double baggage) {
		this.baggage = baggage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Ticket{" + "idTicket=" + ticketID + ", price=" + price
				+ ", baggage=" + baggage + ", type='" + type + '\''
				+  '\'' + ", passenger="
				+ passenger + ", airport=" + airport + ", race=" + race
				+ '}';
	}

}
