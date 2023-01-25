package arrays4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1bis {

	public static void main(String[] args) {
		int tabla[] = new int[10];
//		int numero;
		int pos = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(tabla));

		for (int i = tabla.length-1; i >=0 ; i--) {
			if (tabla[i] % 2 != 0) {
				System.arraycopy(tabla, i+1, tabla, i, tabla.length - i -1);
				tabla = Arrays.copyOf(tabla, tabla.length-1);
			}
		}
		System.out.println(Arrays.toString(tabla));
	}

}
