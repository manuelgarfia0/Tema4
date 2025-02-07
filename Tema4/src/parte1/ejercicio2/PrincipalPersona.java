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

		System.out.println("Apellidos de la primera persona: ");
		apellidos = scanner.nextLine();
		;

		System.out.println("Edad de la primera persona: ");
		edad = scanner.nextInt();

		// Limpio escaner
		scanner.nextLine();

		System.out.println("DNI de la primera persona: ");
		DNI = scanner.nextLine();

		p1 = new Persona(DNI, nombre, apellidos, edad);

		System.out.println("Nombre de la segunda persona: ");
		nombre = scanner.nextLine();

		System.out.println("Apellidos de la segunda persona: ");
		apellidos = scanner.nextLine();

		System.out.println("Edad de la segunda persona: ");
		edad = scanner.nextInt();

		// Limpio escaner
		scanner.nextLine();
		System.out.println("DNI de la segunda persona: ");
		DNI = scanner.nextLine();

		p2 = new Persona(DNI, nombre, apellidos, edad);

		// Si es menor de edad
		if (p1.esMayorEdad() == false) {
			System.out.println(
					p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDNI() + " no es mayor de edad");
		} else {
			System.out.println(
					p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDNI() + " es mayor de edad");
		}

		if (p2.esMayorEdad() == false) {
			System.out.println(
					p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDNI() + " no es mayor de edad");
		} else {
			System.out.println(
					p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDNI() + " es mayor de edad");
		}

	}
}
