package arrays;

public class Prueba {

	public static void main(String[] args) {
		int edad[];
		edad = new int[5];
		
		System.out.println("Longitud de edad: " + edad.length);
		
		double datos[] = {1, 2, 3, 4};
		System.out.println("Longitud de datos: " + datos.length);
		//datos = {1, 2, 3, 4};

		double sumaDatos = 0;
		for(double valor: datos) {
			sumaDatos += valor;
		}
		System.out.println(sumaDatos);
	}

}
