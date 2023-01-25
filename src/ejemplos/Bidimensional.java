package ejemplos;

import java.util.Arrays;

public class Bidimensional {

	public static void main(String[] args) {
		int uni[] = { 1, 3, 6, 8 };

		int tabla[][] = { { 1, 3, 6, 8, 5, 1 }, { 1, 3, 6, 8, 4, 7 }, { 1, 3, 6, 8, 9, 5 }, { 1, 3, 6, 8, 1, 5 } };

		tabla[0][1] = 24;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(Arrays.deepToString(tabla));

		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}

		System.out.println("Filas: " + tabla.length);
		System.out.println("Columnas: " + tabla[1].length);
	}

}
