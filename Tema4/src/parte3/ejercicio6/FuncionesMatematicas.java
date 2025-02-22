package parte3.ejercicio6;

public class FuncionesMatematicas {
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static int sumatorio(int numero) {
		if (numero == 1) {
			return 1;
		}
		return numero + sumatorio(numero - 1);
	}

	/**
	 * 
	 * @param a
	 * @param n
	 * @return
	 */
	public static double potencia(double a, int n) {
		if (n == 0) {
			return 1;
		}
		return a * potencia(a, n - 1);
	}

	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static int serieFibonacci(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
		return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
	}
}
