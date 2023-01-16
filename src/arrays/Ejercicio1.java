package arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numAleatorios[] = new int[10];
		
		for(int i=0; i<=numAleatorios.length-1; i++) {
			numAleatorios[i]=(int)(Math.random()*100+1);
			System.out.println(numAleatorios[i]);
		}
	}

}
