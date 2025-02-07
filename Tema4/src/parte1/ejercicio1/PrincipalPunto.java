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
		System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("(" + p3.getX() + ", " + p3.getY() + ")");
		// Variamos con operadores las coordenadas
		p1.setXY(p1.getX() + 3, p1.getY() - 1);

		p2.setXY(p2.getX() * 2, p2.getY() - 1);

		p3.setXY(p3.getX() + 3, p3.getY() + 1);
		// Imprimimos las tres coordenadas
		System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("(" + p3.getX() + ", " + p3.getY() + ")");
		// Calculo la distancia de un punto a otro
		System.out.println(p1.distancia(p2));
		// Imprimo los puntos usando los métodos
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}
