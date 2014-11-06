package Util;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.academysmart.jpa.model.Flight;

public class FlightUtil {
	private EntityTransaction tx;
	
	public void addFlight(Flight flight) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.persist(flight);
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
	public void deleteFlight(Flight flight) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.remove(flight);
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
	public Flight getFlightByID(long FlightID) {
		Flight fl = null;
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			fl = Manager.em.find(Flight.class, FlightID);
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

		return fl;
	}

	@SuppressWarnings("unchecked")
	public List<Flight> getAllFlights() {
		List<Flight> fl = null;
		try {
			Manager.setUp();
			fl = Manager.em.createNativeQuery("selectFlights").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return fl;
	}
}
