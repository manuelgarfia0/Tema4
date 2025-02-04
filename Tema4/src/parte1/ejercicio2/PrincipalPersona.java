package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Declaro dos personas
		Persona p1;
		Persona p2;

		String DNI = "";
		String nombre = "";
		String apellidos = "";
		int edad = 0;
		// Preguntamos por los datos de ambas personas
		System.out.println("Nombre de la primera persona: ");
		nombre = scanner.nextLine();

		p1 = new Persona(DNI, nombre, apellidos, edad);

		System.out.println("Apellidos de la primera persona: ");
		apellidos = scanner.nextLine();

		p1 = new Persona(DNI, nombre, apellidos, edad);

		System.out.println("Edad de la primera persona: ");
		edad = scanner.nextInt();

		p1 = new Persona(DNI, nombre, apellidos, edad);

		// Limpio escaner
		scanner.nextLine();

		System.out.println("DNI de la primera persona: ");
		DNI = scanner.nextLine();

		p1 = new Persona(DNI, nombre, apellidos, edad);

		System.out.println("Nombre de la segunda persona: ");
		nombre = scanner.nextLine();

		p2 = new Persona(DNI, nombre, apellidos, edad);

		System.out.println("Apellidos de la segunda persona: ");
		apellidos = scanner.nextLine();

		p2 = new Persona(DNI, nombre, apellidos, edad);

		System.out.println("Edad de la segunda persona: ");
		edad = scanner.nextInt();

		p2 = new Persona(DNI, nombre, apellidos, edad);

		// Limpio escaner
		scanner.nextLine();
		System.out.println("DNI de la segunda persona: ");
		DNI = scanner.nextLine();

		p2 = new Persona(DNI, nombre, apellidos, edad);

		// Si es menor de edad
		if (p1.edad < 18) {
			System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI + " no es mayor de edad");
		} else {
			System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI + " es mayor de edad");
		}

		if (p2.edad < 18) {
			System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI + " no es mayor de edad");
		} else {
			System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI + " es mayor de edad");
		}

	}
}
