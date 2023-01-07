package arrays;

import java.util.Arrays;

public class InsercionOrdenada {

	public static void main(String[] args) {

		int tabla[] = { 1, 2, 3, 4, 6, 7, 8 }; // tabla original
		int copia[] = new int[tabla.length + 1]; // tabla destino
		int nuevoElemento = 5; // elemento a insertar
		
		int indiceInsercion = Arrays.binarySearch(tabla, nuevoElemento); // miramos si ya existe el elemento

		// Si indiceInsercion >= 0, el nuevo elemento (que está repetido) se inserta en
		// el lugar en que ya estaba, desplazando al original.
		// Si indiceInsercion < 0, significa que no está en la tabla y hay que
		// insertarlo
		// Tenemos que averiguar en qué posición insertarlo:
		if (indiceInsercion < 0) {
			// cuando no se encuentra el elemento en la tabla, binarySearch devuelve un
			// valor negativo indicando la posición en que debía encontrarse el elemento + 1
			indiceInsercion = -indiceInsercion - 1;
		}

		// Utilizamos el método arraycopy de la clase System para así copiar los
		// elementos que nos interesan en la tabla copia
		// Copiamos los elementos a la izquierda del nuevo elemento
		System.arraycopy(tabla, 0, copia, 0, indiceInsercion);
		// Copiamos los elementos a la derecha del nuevo elemento
		System.arraycopy(tabla, indiceInsercion, copia, indiceInsercion + 1, tabla.length - indiceInsercion);
		// Insertamos el nuevo elemento en su posición
		copia[indiceInsercion] = nuevoElemento;

		// Asignamos a tabla el valor de copia para tener la sensación de que estamos en
		// la misma tabla
		tabla = copia;

		// Imprimimos el resultado
		System.out.println(Arrays.toString(tabla));
		
	}

}
