package parte3.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {
	/**
	 * 
	 * @param cantidad cantidad de numeros aleatorios a generar
	 */
	public static void numerosAleatorios(int cantidad) {
		Random random = new Random();
		for (int i = 0; i < cantidad; i++) {
			System.out.println(random.nextDouble());
		}
	}

	/**
	 * 
	 * @param cantidad cantidad de numeros aleatorios a generar
	 * @param max      valor maximo que tomara el numero aleatorio
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		Random rand = new Random();
		for (int i = 0; i < cantidad; i++) {
			System.out.println(rand.nextInt(max + 1));
		}
	}

	/**
	 * 
	 * @param cantidad cantidad de numeros aleatorios a generar
	 * @param min      valor minimo que tomara el numero aleatorio
	 * @param max      valor maximo que tomara el numero aleatorio
	 */
	public static void numerosAleatorios(int cantidad, int min, int max) {
		Random rand = new Random();
		for (int i = 0; i < cantidad; i++) {
			System.out.println(rand.nextInt((max - min) + 1) + min);
		}
	}
}