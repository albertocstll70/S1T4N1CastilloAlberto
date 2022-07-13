package s1t4n1exercici1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InsertListTest {

	ListMonth listMes;

	@Before
	public void before() {
		listMes = new ListMonth();
		listMes.lista();

	}

	@Test
	public void testSize() {

		int resultado = listMes.getMonth().size();
		int esperado = 12;

		assertEquals(esperado, resultado);

	}

	@Test
	public void testNull() {

		assertNotNull(listMes.getMonth());

	}

	@Test
	public void testPosicio() {

		assertEquals("August", listMes.getMonth().get(7)); // 0123456789101112
	}

}
