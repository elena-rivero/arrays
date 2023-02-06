package funciones;

public class Ejercicio1 {
	public static long sumaTabla(int[] tabla) {
		long suma = 0;
		
		for(int elemento : tabla) {
			suma += elemento;
		}
		
		return suma;
	}
}
