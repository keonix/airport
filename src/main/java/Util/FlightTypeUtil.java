package Util;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.academysmart.jpa.model.FlightType;

;

public class FlightTypeUtil {


	private EntityTransaction tx;

	public void addFlightType(FlightType flighttype) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.persist(flighttype);
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
	public void deleteFlightType(FlightType flighttype) throws Exception {
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			Manager.em.remove(flighttype);
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
	public FlightType getFlightTypeByID(long FlightTypeID) {
		FlightType ft = null;
		try {
			Manager.setUp();
			tx = Manager.em.getTransaction();
			tx.begin();
			ft = Manager.em.find(FlightType.class, FlightTypeID);
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

		return ft;
	}

	@SuppressWarnings("unchecked")
	public List<FlightType> getAllFlightTypes() {
		List<FlightType> ft = null;
		try {
			Manager.setUp();
			ft = Manager.em.createNativeQuery("selectFlightTypes").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Manager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ft;
	}
}
