package parte1.ejercicio3;

public class Rectangulo {

	int x1;
	int y1;
	int x2;
	int y2;

	// Saco el ancho
	public int Ancho() {
		return Math.abs(x2 - x1);
	}

	// Saco el alto
	public int Alto() {
		return Math.abs(y2 - y1);
	}

	// Saco el perimetro
	public int Perimetro() {
		return 2 * (Alto() + Ancho());
	}

	// Saco el área
	public int Area() {
		return (Alto() * Ancho());
	}

}
