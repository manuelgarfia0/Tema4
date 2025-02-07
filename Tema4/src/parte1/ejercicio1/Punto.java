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

	/**
	 * 
	 * @param x con las modificaciones pertinentes
	 * @param y con las modificaciones pertinentes
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @param dx
	 * @param dy
	 */
	public void desplaza(int dx, int dy) {
		int newX = dx + getX();
		int newY = dy + getY();
	}

	/**
	 * 
	 * @param p punto al que se refiere
	 * @return distancia entre dos puntos
	 */
	public double distancia(Punto p) {
		return Math.sqrt((Math.pow(this.x, 2) - Math.pow(p.getX(), 2)) + (Math.pow(this.y, 2)) - Math.pow(p.getY(), 2));
	}

	/**
	 * @return la coordenada entre los dos puntos
	 */
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
