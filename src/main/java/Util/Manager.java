package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;

public class Manager {

		public static EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("derbyTest");
		public static EntityManager em;
		
	
		public static void setUp() throws Exception {
			em = emf.createEntityManager();
			
		}
	
		public static void tearDown() throws Exception {
			if (em != null) {
				em.clear();
			}
		}
	
	
}
