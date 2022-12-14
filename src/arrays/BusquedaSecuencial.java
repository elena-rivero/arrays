package arrays;

public class BusquedaSecuencial {

	public static void main(String[] args) {
		
		// En este índice almacenaremos el índice en el que se encuentre el elemento buscado
		int indiceBusqueda = 0;
		
		// Tabla en la que realizaremos la búsqueda
		int tabla[] = {14, 10, 5, 30, 25};
		
		// Valor a buscar
		int valor = 5;
		
		// Mientras no encontremos el valor y no hayamos llegado al final de la tabla
		// incrementamos en 1 el índice de búsqueda
		while(valor != tabla[indiceBusqueda] && indiceBusqueda<tabla.length) {
			indiceBusqueda++;
		}
		
		// En caso de que el índice sea menor que la longitud de la tabla
		// significa que hemos encontrado el elemento
		if(indiceBusqueda < tabla.length) {
			System.out.println("El valor " + valor + " se encuentra en la posicón " + indiceBusqueda);
		} else {
			// En caso de que el índice se igual o mayor a la longitud de la tabla
			// significa que el elemento no se encuentra en la tabla
			System.out.println("El elemento " + valor + " no se encuentra en la tabla.");
		}
	}

}
