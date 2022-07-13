package s1t4n1exercici3;

import java.util.ArrayList;

public class Lista {
	
	private int numeroPosiciones;

	public Lista(int numeroPosiciones) {
		this.numeroPosiciones = numeroPosiciones;
	}
	
	
	public ArrayList<Integer> lista() throws IndexOutOfBoundsException{
		ArrayList<Integer> listNumero = new ArrayList<Integer>();
		
		for(int i=0; i<this.numeroPosiciones; i++) {
			
			listNumero.add(i);
			
		}
		
		
	return listNumero;
		
	}
	

}
