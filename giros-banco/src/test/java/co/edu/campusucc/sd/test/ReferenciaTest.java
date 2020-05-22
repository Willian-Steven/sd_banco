package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.ReferenciaDAO;
import co.edu.campusucc.sd.modelo.Referencia;


class ReferenciaTest {

	@Test
	void testPersist() {
		
		ReferenciaDAO dao = new ReferenciaDAO();
		
		Referencia ref = new Referencia();

		ref.setDestinatario("Carlos");
		ref.setDocumento("1123543654");
		ref.setIdGiro("11");
		ref.setReceptor("Giros y servicios");
		
		try {
			dao.persist(ref);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}