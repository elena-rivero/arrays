package ejemplos;

import java.util.Arrays;

public class Funciones {

	public static void main(String[] args) {
		int tabla[] = { 5, 6, 3, 1, 2 };
		int tabla2[] = funcion(tabla);
		
		System.out.println("Fuera de la función");
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(tabla2));
	}

	static int[] funcion(int[] t) {
		int[] tabla = Arrays.copyOf(t, t.length);
		tabla[2] = 10;
		System.out.println("Dentro de la función");
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(tabla));
		return tabla;
	}
	
	static int maximo(int[] tabla) {
		int max=0;
		for(int valor : tabla) {
			if(valor > max) {
				max = valor;
			}
		}
		return max;
	}
}
