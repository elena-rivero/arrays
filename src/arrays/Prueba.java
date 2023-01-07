package arrays;

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int edad[];
		edad = new int[5];
		Arrays.fill(edad, 18);
		Arrays.fill(edad,  0, 4, 23);
		System.out.println(Arrays.toString(edad));
		
		double datos[] = {1, 2, 3, 4};
		String tabla = Arrays.toString(datos);
		System.out.println(tabla);
	}

}
