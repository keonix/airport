package Util;
import java.util.List;

import javax.persistence.EntityTransaction;

import com.academysmart.jpa.model.Passenger;
import com.academysmart.jpa.model.Race;
import com.academysmart.jpa.model.Ticket;


public class RaceUtil {

private EntityTransaction tx;
	
	public void addRace(Race race) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.persist(race);
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
	public void deleteRace(Race race) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.remove(race);
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
	public Race getRaceByID(long RaceID) {
		Race  race  = null;
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			race = Manager.em.find(Race.class, RaceID);
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

		return race;
	}

	@SuppressWarnings("unchecked")
	public List<Race> getAllRaces() {
		List<Race> race = null;
		try {
			Manager.setUp();
		race = Manager.em.createNativeQuery("selectRaces").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return race;
	}}
