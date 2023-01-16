package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una tabla de números reales de longitud 10
		double numReales[] = new double[10];
		
		// Variables para almacenar el máximo y el mínimo
		double maxValor = Double.MIN_VALUE;
		double minValor = Double.MAX_VALUE;
		
		// Creo el Scanner para leer los números por teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pido al usuario que escriba números reales
		// y los almaceno en la tabla
		for(int i=0; i<numReales.length; i++) {
			System.out.println("Introduzca un número");
			numReales[i] = sc.nextDouble();
		}

		for(double valor: numReales) {
			if(valor<minValor) {
				minValor = valor;
			}
			if(valor>maxValor) {
				maxValor = valor;
			}
		}
		//Cierro el Scanner
		sc.close();
	}

}
