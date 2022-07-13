package s1t4n1exercici3;

import org.junit.Test;

public class ArrayExceptionTest {

	@Test(expected = IndexOutOfBoundsException.class)
	public void test() {
		Lista l = new Lista(4);
		l.lista().get(4);// Si introducimos una posición valida (0, 1, 2, ó 3) llamaría la excepción,

	}

}
