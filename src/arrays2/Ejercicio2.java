package arrays2;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int tabla[] = new int[55];
		int inicio =0, fin = 0;
		
		for(int i=1; i<=10; i++) {
			fin = inicio +i;
			
			Arrays.fill(tabla, inicio, fin, i);
			
			inicio = fin;
		}
		System.out.println(Arrays.toString(tabla));
	}

}
