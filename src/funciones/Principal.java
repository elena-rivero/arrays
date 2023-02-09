package funciones;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		int[] tabla = { 2, 3, 6, 5, 2, 5, 8, 7, 34 };
		int[] result = Ejercicio5.sinRepetidos(tabla);
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(result));
	}

}
