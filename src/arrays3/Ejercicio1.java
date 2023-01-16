package arrays3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Array donde se guardarán los 15 valores introducidos por el usuario
		int tabla[] = new int[15];
		int tablaDestino [] = new int[15];
		
		// Variable donde guardaremos el valor introducido por el usuario
		int numero;
		// Creación de Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		// Bucle para guardar los 15 números en la tabla
		for(int i=0; i<tabla.length; i++) {
			// Le pedimos al usuario que introduzca un número
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			// Guardamos el número en la posición i
			tabla[i] = numero;
		}
		
		System.out.println("Tabla origen: " + Arrays.toString(tabla));
		
		// tablaOrigen, posIniOrigen, tablaDestino, posIniDestino, numeroElementos
		System.arraycopy(tabla, 0, tablaDestino, 1, tabla.length-1);
		tablaDestino[0] = tabla[tabla.length-1];
		
		System.out.println("Tabla destino: " + Arrays.toString(tablaDestino));		
		
		// Cierre de Scanner
		sc.close();
		
	}

}
