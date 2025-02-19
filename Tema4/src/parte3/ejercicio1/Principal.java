package parte3.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// Creo el objeto suma
		Suma suma = new Suma();
		// Llamo a la función indicándole unos valores
		int resultadoEntero = suma.suma(5, 3);
		System.out.println(resultadoEntero);
		// Llamo a la función indicándole unos valores
		double resultadoDouble = suma.suma(5.5, 3.2);
		System.out.println(resultadoDouble);
	}
}