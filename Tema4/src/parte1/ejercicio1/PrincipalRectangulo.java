package parte1.ejercicio1;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		// Declaramos los puntos para las coordenadas
		Rectangulo p1 = new Rectangulo();
		Rectangulo p2 = new Rectangulo();
		int perimetro;
		int area;
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
		// Calculo el perímetro y el área
		perimetro = 0;
		area = 0;
	}

}
