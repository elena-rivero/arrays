package arrays2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		int numero;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<20; i++) {
			numero = sc.nextInt();
			if(i<=9) {
				tabla1[i] = numero;
			} else {
				tabla2[i] = numero;
			}
		}
		sc.close();
	}

}
