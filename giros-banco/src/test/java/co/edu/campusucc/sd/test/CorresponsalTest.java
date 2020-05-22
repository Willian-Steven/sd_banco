package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.CorresponsalDAO;
import co.edu.campusucc.sd.modelo.Corresponsal;



class CorresponsalTest {

	@Test
	void testPersist() {
		
		CorresponsalDAO dao = new CorresponsalDAO();
		Corresponsal crr = new Corresponsal();

		crr.setIdCorresponsal("4135");
		
		try {
			dao.persist(crr);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}