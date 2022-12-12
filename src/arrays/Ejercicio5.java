package arrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una tabla de números reales de longitud 10
		double numReales[] = new double[10];
		
		// Variables para almacenar el máximo y el mínimo
		double max, min;
		
		// Creo el Scanner para leer los números por teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pido al usuario que escriba números reales
		// y los almaceno en la tabla
		for(int i=0; i<numReales.length; i++) {
			numReales[i] = sc.nextDouble();
		}

		max = numReales[0];
		min = numReales[0];
		
		// Vuelvo a recorrer la tabla para averiguar cuál es
		// el mínimo y cuál es el máximo
		for(double valor : numReales) {
			if(valor > max) {
				max = valor;
			}
			if(valor < min) {
				min = valor;
			}
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
