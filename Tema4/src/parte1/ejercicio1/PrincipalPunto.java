package parte1.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {
		// Declaro tres puntos que serán coordenadas
		Punto p1;
		Punto p2;
		Punto p3;
		// Variable para punto x
		int x;
		// Variable para punto y
		int y;
		// Inicializamos las variables a los valores correspondientes
		x = 5;
		y = 0;

		p1 = new Punto(x, y);

		x = 10;
		y = 10;

		p2 = new Punto(x, y);

		x = -3;
		y = 7;

		p3 = new Punto(x, y);

		// Imprimimos las tres coordenadas
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
		System.out.println("(" + p3.x + ", " + p3.y + ")");
		// Variamos con operadores las coordenadas
		p1.x += 3;
		p1.y -= 1;

		p2.x *= 2;
		p2.y -= 1;

		p3.x += 3;
		p3.y += 1;
		// Imprimimos las tres coordenadas
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
		System.out.println("(" + p3.x + ", " + p3.y + ")");
	}

}
