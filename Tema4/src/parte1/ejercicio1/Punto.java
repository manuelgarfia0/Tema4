package parte1.ejercicio1;

public class Punto {
	// Declaro las variables x e y para las coordenadas de los puntos
	private int x = 0;
	private int y = 0;
	// Constructor
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * 
	 * @return el punto x
	 */
	public int getX() {
		return x;
	}
	/**
	 * 
	 * @param x con las modificaciones pertinentes
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * 
	 * @return el punto y
	 */
	public int getY() {
		return y;
	}
	/**
	 * 
	 * @param y con las modificaciones pertinentes
	 */
	public void setY(int y) {
		this.y = y;
	}

}
