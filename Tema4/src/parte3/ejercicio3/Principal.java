package parte3.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// Creo el objeto sumaEnteros
		SumaEnteros sumaEnteros = new SumaEnteros();
		// Llamo a la función indicándole unos valores
		int sumaEnteros1 = sumaEnteros.sumaEnteros(5);
		System.out.println(sumaEnteros1);
		// Llamo a la función indicándole unos valores
		int sumaEnteros2 = sumaEnteros.sumaEnteros(3, 10);
		System.out.println(sumaEnteros2);

	}

}
