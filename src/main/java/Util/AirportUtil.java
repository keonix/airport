package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.academysmart.jpa.model.Airport;
import com.academysmart.jpa.model.Race;

public class AirportUtil {

	private EntityTransaction tx;

	public void addAirport(Airport airport)  {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.persist(airport);
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
	
	public Airport getAirportByID(long AirportID) {
		Airport air = null;
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			air = Manager.em.find(Airport.class, AirportID);
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

		return air;
	}

	@SuppressWarnings("unchecked")
	public List<Airport> getAllAirports() {
		List<Airport> air = null;
		try {
			Manager.setUp();
			air = Manager.em.createNativeQuery("selectAirports").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return air;
	}
}
