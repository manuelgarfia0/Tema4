package parte1.ejercicio3;

public class Rectangulo {

	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;

	// Constructor
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	/**
	 * 
	 * @return punto x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * 
	 * @param x1 modificado
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * 
	 * @return punto y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * 
	 * @param y1 modificado
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * 
	 * @return punto x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * 
	 * @param x2 modificado
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * 
	 * @return punto y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * 
	 * @param y2 modificado
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

	/**
	 * 
	 * @return ancho del rectángulo
	 */
	// Saco el ancho
	public int Ancho() {
		return Math.abs(x2 - x1);
	}

	/**
	 * 
	 * @return alto del rectángulo
	 */
	// Saco el alto
	public int Alto() {
		return Math.abs(y2 - y1);
	}

	/**
	 * 
	 * @return perímetro del retángulo
	 */
	// Saco el perimetro
	public int Perimetro() {
		return 2 * (Alto() + Ancho());
	}

	/**
	 * 
	 * @return área del rectángulo
	 */
	// Saco el área
	public int Area() {
		return (Alto() * Ancho());
	}

}
