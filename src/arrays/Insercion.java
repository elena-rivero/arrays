package arrays;

import java.util.Arrays;

public class Insercion {

	public static void main(String[] args) {
		
		// Tabla con 5 elementos
		int tabla[] = {3, 13, 26, 6, 12};
		
		// Nuevo elemento a insertar
		int nuevoElemento = 10;
		
		// Copiamos en la misma variable tabla la misma 
		// tabla pero con una posición más
		tabla = Arrays.copyOf(tabla, tabla.length+1);
		
		// Añadimos en la última posición de la tabla 
		// el elemento a insertar
		tabla[tabla.length-1] = nuevoElemento;
		
	}

}
