package utils;

public class Utils {
	public static int busquedaSecuencial(int tabla[], int valor) {
		// En este índice almacenaremos el índice en el que se encuentre el elemento
		// buscado
		int indiceBusqueda = 0;

		// Mientras no encontremos el valor y no hayamos llegado al final de la tabla
		// incrementamos en 1 el índice de búsqueda
		while (indiceBusqueda < tabla.length && valor != tabla[indiceBusqueda]) {
			indiceBusqueda++;
		}

		// En caso de que el índice sea mayor que la longitud de la tabla
		// significa que no hemos encontrado el elemento
		if (indiceBusqueda >= tabla.length) {
			indiceBusqueda = -1;
		}

		return indiceBusqueda;
	}
}
