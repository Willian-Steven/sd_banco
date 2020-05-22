package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.BancoDAO;

import co.edu.campusucc.sd.modelo.Banco;


class BancoTest {

	@Test
	void testPersist() {
		BancoDAO dao = new BancoDAO();
		Banco bc = new Banco();

		bc.setIdBanco("217");
		bc.setNombre("Bancolombia");
		bc.setNumeroCuenta("11232");
		bc.setSede("Cali");
		
		try {
			dao.persist(bc);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}