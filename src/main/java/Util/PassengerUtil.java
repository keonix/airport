package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.academysmart.jpa.model.Flight;
import com.academysmart.jpa.model.Passenger;
import com.academysmart.jpa.model.Race;

public class PassengerUtil {

private EntityTransaction tx;
	
	public void addPassenger(Passenger passenger) {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.persist(passenger);
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
	public void deletePassenger(Passenger passenger) {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.remove(passenger);
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
	public Passenger getPassengerByID(long PassengerID) {
	Passenger pass = null;
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			pass = Manager.em.find(Passenger.class, PassengerID);
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

		return pass;
	}

	@SuppressWarnings("unchecked")
	public List<Passenger> getAllPassengers() {
		List<Passenger> pass = null;
		try {
			Manager.setUp();
			pass = Manager.em.createNativeQuery("selectPassengers").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pass;
	}
}
