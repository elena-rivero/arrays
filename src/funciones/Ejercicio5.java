package funciones;

import java.util.Arrays;

import utils.Utils;

public class Ejercicio5 {

	public static int[] sinRepetidos(int t[]) {
		// Tabla resultante
		int[] resul = new int[0];
		
		// Variable que guarda el resultado de la búsqueda secuencial
		int busqueda;

		// Recorro la tabla original
		for (int element : t) {
			// Busco el elemento en la tabla resultante
			busqueda = Utils.busquedaSecuencial(resul, element);
			// Si no se encuentra, se inserta el elemento al final
			if (busqueda < 0) {
				resul = Arrays.copyOf(resul, resul.length+1);
				resul[resul.length-1] = element;
			}
		}

		// Devolvemos la tabla resultante
		return resul;
	}

	
}
