package parte3.ejercicio3;

public class SumaEnteros {
	/**
	 * 
	 * @param num numero definido en el main
	 * @return suma de todos los números del 1 al número definido
	 */
	public int sumaEnteros(int num) {
		int res = 0;
		for (int i = 1; i <= num; i++) {
			res += i;
		}
		return res;
	}

	/**
	 * 
	 * @param num1 numero 1 definido
	 * @param num2 numero 2 definido
	 * @return suma de todos los números comprendidos entre el primer y segundo
	 *         número definidos
	 */
	public int sumaEnteros(int num1, int num2) {
		int res = 0;
		for (int i = num1; i <= num2; i++) {
			res += i;
		}
		return res;
	}

}
