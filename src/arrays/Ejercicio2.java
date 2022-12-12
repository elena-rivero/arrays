package arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int sumaTotal=0;
		int numAleatorios[] = new int[10];

		// Primero creamos la tabla y guardamos valores
		for (int i = 0; i < numAleatorios.length; i++) {
			numAleatorios[i] = (int) (Math.random() * 100 + 1);
			System.out.println(numAleatorios[i]);
		}
		
		// Luego la recorremos para sumar sus valores
		for(int valor : numAleatorios) {
			sumaTotal += valor;
		}
		System.out.println("Suma total: " + sumaTotal);
	}

}
