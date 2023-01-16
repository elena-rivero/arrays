package arrays;

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int tabla[] = {3, 5, 8, 2, 10};
		int nuevaTabla[] = new int[tabla.length+1];
		
		int nuevoElemento = 13;
		
		System.arraycopy(tabla, 0, nuevaTabla, 1, tabla.length);
		nuevaTabla[0] = nuevoElemento;
		tabla = nuevaTabla;
		System.out.println(Arrays.toString(tabla));
		
	}

}
