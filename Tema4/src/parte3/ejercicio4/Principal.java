package parte3.ejercicio4;

public class Principal {

	public static void main(String[] args) {
		// creo el objeto parseToBoolean
		ParseToBoolean parseToBoolean = new ParseToBoolean();
		// Llamo a la función indicándole unos valores
		boolean parseToBoolean1 = parseToBoolean.parseToBoolean(0);
		System.out.println(parseToBoolean1);
		// Llamo a la función indicándole unos valores
		boolean parseToBoolean2 = parseToBoolean.parseToBoolean("true");
		System.out.println(parseToBoolean2);
	}

}
