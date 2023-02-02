package bidimensionales;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tabla[][] = new int[4][5];
		int sumaFila = 0;
		int sumaCol = 0;
		int total = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int) (Math.random() * (999 - 100 + 1) + 100);
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
				total += tabla[i][j];
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println(sumaFila);
		}
		for (int col = 0; col < tabla[0].length; col++) {
			sumaCol = 0;
			for (int fila = 0; fila < tabla.length; fila++) {
				sumaCol += tabla[fila][col];
			}
			System.out.print(sumaCol + "\t");
		}
		System.out.println(total);
	}

}
