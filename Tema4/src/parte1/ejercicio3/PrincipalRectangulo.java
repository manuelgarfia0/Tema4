package parte1.ejercicio3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		// Declaramos los puntos para las coordenadas
		Rectangulo p1 = new Rectangulo();
		Rectangulo p2 = new Rectangulo();
		// Inicializamos los puntos a los valores correspondientes
		p1.x1 = 0;
		p1.y1 = 0;
		p1.x2 = 5;
		p1.y2 = 5;
		p2.x1 = 7;
		p2.y1 = 9;
		p2.x2 = 2;
		p2.y2 = 3;
		// Imprimimos las coordenadas
		System.out.println("(" + p1.x1 + ", " + p1.y1 + ")");
		System.out.println("(" + p1.x2 + ", " + p1.y2 + ")");
		System.out.println("(" + p2.x1 + ", " + p2.y1 + ")");
		System.out.println("(" + p2.x2 + ", " + p2.y2 + ")");
		// Imprimo el perímetro y área
		imprimirRectangulo(p1);
		imprimirRectangulo(p2);
		// Modifico las coordenadas
		p1.x1 = 3;
		p1.y1 = 4;
		p1.x2 = 1;
		p1.y2 = 2;
		p2.x1 = 8;
		p2.y1 = 8;
		p2.x2 = 3;
		p2.y2 = 2;
		// Imprimimos las coordenadas
		System.out.println("(" + p1.x1 + ", " + p1.y1 + ")");
		System.out.println("(" + p1.x2 + ", " + p1.y2 + ")");
		System.out.println("(" + p2.x1 + ", " + p2.y1 + ")");
		System.out.println("(" + p2.x2 + ", " + p2.y2 + ")");
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
