package Util;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.academysmart.jpa.model.Passenger;
import com.academysmart.jpa.model.Ticket;

public class TiñketUtil {


private EntityTransaction tx;
	
	public void addTicket(Ticket ticket) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.persist(ticket);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void deleteTicket(Ticket ticket) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.remove(ticket);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public Ticket getTicketByID(long TicketID) {
	Ticket ticket = null;
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			ticket = Manager.em.find(Ticket.class, TicketID);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return ticket;
	}

	@SuppressWarnings("unchecked")
	public List<Ticket> getAllTickets() {
		List<Ticket> ticket = null;
		try {
			Manager.setUp();
			ticket = Manager.em.createNativeQuery("selectTickets").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ticket;
	}
	
	public double calculatePrice(Ticket ticket){
		double price = 0;
		double priceForBaggage = 0;
		priceForBaggage  = ticket.getBaggage()*40;
		price = ticket.getRace().getPrice() +
				ticket.getRace().getFlightType().getClassContango();
		if(ticket.getType().equals("child")&&!(ticket.getRace().getFlightType().getClass().equals(("First")))
				){price = price*0.8;}
		price += priceForBaggage;
		return price;}
}
