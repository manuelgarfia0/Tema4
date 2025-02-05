package parte1.ejercicio3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		// Declaramos los puntos para las coordenadas
		Rectangulo p1;
		Rectangulo p2;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		// Inicializamos los puntos a los valores correspondientes
		x1 = 0;

		p1 = new Rectangulo(x1, y1, x2, y2);

		y1 = 0;

		p1 = new Rectangulo(x1, y1, x2, y2);

		x2 = 5;

		p1 = new Rectangulo(x1, y1, x2, y2);

		y2 = 5;

		p1 = new Rectangulo(x1, y1, x2, y2);

		x1 = 7;

		p2 = new Rectangulo(x1, y1, x2, y2);

		y1 = 9;

		p2 = new Rectangulo(x1, y1, x2, y2);

		x2 = 2;

		p2 = new Rectangulo(x1, y1, x2, y2);

		y2 = 3;

		p2 = new Rectangulo(x1, y1, x2, y2);

		// Imprimimos las coordenadas
		System.out.println("(" + p1.getX1() + ", " + p1.getY1() + ")");
		System.out.println("(" + p1.getX2() + ", " + p1.getY2() + ")");
		System.out.println("(" + p2.getX1() + ", " + p2.getY1() + ")");
		System.out.println("(" + p2.getX2() + ", " + p2.getY2() + ")");
		// Imprimo el perímetro y área
		imprimirRectangulo(p1);
		imprimirRectangulo(p2);
		// Modifico las coordenadas
		p1.setX1(3);
		p1.setY1(4);
		p1.setX2(1);
		p1.setY2(2);
		p2.setX1(8);
		p2.setY1(8);
		p2.setX2(3);
		p2.setY2(2);
		// Imprimimos las coordenadas
		System.out.println("(" + p1.getX1() + ", " + p1.getY1() + ")");
		System.out.println("(" + p1.getX2() + ", " + p1.getY2() + ")");
		System.out.println("(" + p2.getX1() + ", " + p2.getY1() + ")");
		System.out.println("(" + p2.getX2() + ", " + p2.getY2() + ")");
		// Imprimo el perímetro y área
		imprimirRectangulo(p1);
		imprimirRectangulo(p2);
	}

	public static void imprimirRectangulo(Rectangulo r) {
		// Muestro el perímetro
		System.out.println("Perímetro: " + r.Perimetro());
		// Muestro el área
		System.out.println("Área: " + r.Area());
	}

}
