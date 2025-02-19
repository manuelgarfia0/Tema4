package parte3.ejercicio4;

public class ParseToBoolean {
	/**
	 * 
	 * @param num numero del que depende que sea true o false
	 * @return false si num es 0 o true si num es 1
	 */
	public boolean parseToBoolean(int num) {
		boolean res = false;
		if (num == 0) {
			res = false;
		} else if (num == 1) {
			res = true;
		}
		return res;
	}

	/**
	 * 
	 * @param cadena cadena que será true o false
	 * @return false si la cadena es false, true si la cadena es true
	 */
	public boolean parseToBoolean(String cadena) {
		boolean res = false;
		if (cadena.equals("false")) {
			res = false;
		} else if (cadena.equals("true")) {
			res = true;
		}
		return res;
	}

}
