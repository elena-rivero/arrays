package arrays4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Necesitaremos una tabla para almacenar los números favoritos
		int tabla[];

		// Cantidad de números favoritos que tiene
		int numFav;

		// Variable donde vamos guardando los números favoritos
		int numero;

		// Indices aleatorios
		int num1, num2;

		// Creación del Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario cuántos números favoritos tiene
		System.out.println("¿Cuántos números favoritos tiene?");
		numFav = sc.nextInt();

		// Creamos la tabla de tamaño numFav
		tabla = new int[numFav];

		// Le pedimos al usuario sus números favoritos
		// y lo almacenamos en la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca uno de sus números favoritos:");
			numero = sc.nextInt();
			tabla[i] = numero;
		}

		// Ordenamos la tabla
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));

		while (tabla.length > 1) {
			num1 = (int) (Math.random() * tabla.length);
			do {
				num2 = (int) (Math.random() * tabla.length);
			} while (num1 == num2);

			System.out.println(num1 + " " + num2);

			tabla[num1] = (tabla[num1]+tabla[num2])/2;
			System.arraycopy(tabla, num2+1, tabla, num2, tabla.length-num2-1);
			tabla = Arrays.copyOf(tabla, tabla.length-1);
			
			Arrays.sort(tabla);
			System.out.println(Arrays.toString(tabla));
		}

		sc.close();
	}

}
