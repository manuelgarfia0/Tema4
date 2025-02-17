package parte3.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// Creo el objeto suma
		Suma suma = new Suma();

		int resultadoEntero = suma.suma(5, 3);
		System.out.println(resultadoEntero);

		double resultadoDouble = suma.suma(5.5, 3.2);
		System.out.println(resultadoDouble);
	}
}