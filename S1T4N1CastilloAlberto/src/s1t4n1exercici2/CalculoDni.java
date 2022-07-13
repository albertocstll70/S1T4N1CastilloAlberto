package s1t4n1exercici2;

public class CalculoDni {

	public static final char[] POSICION_LETRA = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	private final int numPosiciones = 23;

	public CalculoDni() {

	}

	public Character calLetra(int numero) {
		int posicion = numero % this.numPosiciones;
		char letra = POSICION_LETRA[posicion];

		return letra;
	}

}
