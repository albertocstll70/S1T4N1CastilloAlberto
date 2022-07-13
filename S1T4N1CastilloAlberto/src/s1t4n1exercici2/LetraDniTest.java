package s1t4n1exercici2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class LetraDniTest {

	@Parameters
	public static Iterable<Object[]> getData() {
		return Arrays.asList(new Object[][] { { 12345678, 'Z' }, { 87654321, 'X' }, { 14151620, 'L' },
				{ 24681012, 'B' }, { 20304050, 'H' }, { 12131456, 'Z' }, { 56121456, 'F' }, { 10124826, 'L' },
				{ 56248931, 'Q' }, { 45251612, 'D' } });
	}

	private int numDni;
	private char esperado;

	public LetraDniTest(int numDni, char esperado) {
		this.numDni = numDni;
		this.esperado = esperado;

	}

	@Test
	public void test() {
		CalculoDni dni1 = new CalculoDni();

		char result = dni1.calLetra(numDni);
		assertEquals(esperado, result);

	}

}
