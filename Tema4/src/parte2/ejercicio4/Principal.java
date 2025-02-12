package parte2.ejercicio4;

import parte2.ejercicio4.Pizza.Tamaño;

public class Principal {

	public static void main(String[] args) {
		// Creamos varias pizzas
		Pizza pizza1 = new Pizza(34285, "Mediana", "Margarita");
		Pizza pizza2 = new Pizza(48532, "Familiar", "Cuatro quesos");

		// Mostramos la información de las pizzas
		System.out.println(pizza1);
		System.out.println(pizza2);

		// Hacemos algunas modificaciones
		pizza1.setTamaño(Tamaño.Familiar);

		// Volvemos a mostrar la información de las pizzas
		System.out.println(pizza1);
		System.out.println(pizza2);

		// Comprobamos si las pizzas son iguales
		System.out.println(pizza1.equals(pizza2));
	}

}
