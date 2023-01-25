package arrays4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
//		int numero;
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(tabla));
		
		while(pos < tabla.length) {
			if(tabla[pos]%2 != 0) {
				System.arraycopy(tabla, pos+1, tabla, pos, tabla.length - pos -1);
				tabla = Arrays.copyOf(tabla, tabla.length-1);
			} else {
				pos++;
			}
		}
		
		System.out.println(Arrays.toString(tabla));
	}

}
