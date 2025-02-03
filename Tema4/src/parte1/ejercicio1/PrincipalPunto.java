package parte1.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {
		// Declaro tres puntos que serán coordenadas
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();
		// Inicializamos las variables a los valores correspondientes
		p1.x = 5;
		p1.y = 0;

		p2.x = 10;
		p2.y = 10;

		p3.x = -3;
		p3.y = 7;
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
