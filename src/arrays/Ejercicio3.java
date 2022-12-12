package arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos tabla de 5 posiciones de tipo double
		double numeros[] = new double[5];
		
		// Variable donde guardar los valores leídos
		double numero;
		
		// Creamos el Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<numeros.length; i++) {
//			numero = sc.nextDouble();
			numeros[i] = sc.nextDouble();
		}
		
		for(double valor : numeros) {
			System.out.println(valor);
		}
		sc.close();
	}

}
