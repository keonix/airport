package com.academysmart.jpa.model;
import java.sql.Date;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.validator.util.privilegedactions.GetAnnotationParameter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Util.AirportUtil;
import Util.FlightTypeUtil;
import Util.FlightUtil;
import Util.Manager;
import Util.PassengerUtil;
import Util.RaceUtil;
import Util.TiсketUtil;


public class EmployeeIT {

	
	
	@Test
	public void  shouldFindPassenger() throws Exception{
		Manager.setUp();
		PassengerUtil p = new PassengerUtil();
	Passenger pass = Manager.em.find(Passenger.class, 2L);
	assertEquals("Che", pass.getSurname());
		}
	@Test
	public void  shouldFindAirport() throws Exception {
    Manager.setUp();
	Airport air = Manager.em.find(Airport.class, 1L);
	assertEquals("Kiev", air.getCity());
		}
		
		
	@Test
	public void addPassenger() throws Exception {
		  Manager.setUp();
		Passenger pass = new Passenger();
		pass.setName("Ilona");
		pass.setSurname("Glagoleva");
		pass.setPhone("0500870508");
		PassengerUtil pu = new PassengerUtil();
			pu.addPassenger(pass);
				@SuppressWarnings("unchecked")
		List<Passenger> passs = Manager.em.createNamedQuery("selectPassengers").getResultList();
		assertEquals(3, passs.size());
		}
	
	@Test
	public void shouldSellTicket() throws Exception {
		Manager.setUp();
		AirportUtil a = new AirportUtil();
		PassengerUtil pu = new PassengerUtil();
		
	RaceUtil ru = new RaceUtil();
		TiсketUtil tu = new TiсketUtil();
	Ticket ticket = new Ticket();
	ticket.setAirport(a.getAirportByID(1));
	ticket.setBaggage(20);
	ticket.setType("adult");
	ticket.setRace(ru.getRaceByID(1));
	ticket.setPassenger(pu.getPassengerByID(1));
			ticket.setPrice(tu.calculatePrice(ticket));
		tu.addTicket(ticket);
		@SuppressWarnings("unchecked")
		List<Ticket> tickets = Manager.em.createNamedQuery("selectTickets").getResultList();
		assertEquals(1, tickets.size());
		System.out.println(tu.getTicketByID(1));
	}
}
	