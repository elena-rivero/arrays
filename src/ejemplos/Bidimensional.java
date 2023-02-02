package ejemplos;

import java.util.Arrays;

public class Bidimensional {

	public static void main(String[] args) {

		int tabla[][] = 
				{ { 1, 3, 6, 8, 5, 1 }, 
				{ 1, 3, 6, 8, 4, 7 }, 
				{ 1, 3, 6, 8, 9, 5 }, 
				{ 1, 3, 6, 8, 1, 5 } };
		
		for(int col = 0; col<tabla[0].length; col++) {
			for(int fila =0; fila<tabla.length; fila++) {
				System.out.print(tabla[fila][col] + " ");
			}
			System.out.println();
		}	
	}

}
