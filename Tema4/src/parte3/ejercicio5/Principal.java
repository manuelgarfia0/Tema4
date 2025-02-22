package parte3.ejercicio5;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Números aleatorios entre 0 y 1:");
		NumerosAleatorios.numerosAleatorios(2);

		System.out.println("Números aleatorios entre 0 y 10:");
		NumerosAleatorios.numerosAleatorios(3, 10);

		System.out.println("Números aleatorios entre 5 y 15:");
		NumerosAleatorios.numerosAleatorios(3, 5, 15);
	}
}