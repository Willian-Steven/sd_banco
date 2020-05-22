package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Pais;



class PaisTest {

	@Test
	void testPersist() {
		
		PaisDAO dao = new PaisDAO();
		Pais pai = new Pais();

		pai.setIdPais("10");
		pai.setNombrePais("Ecuador");
		
		try {
			dao.persist(pai);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}