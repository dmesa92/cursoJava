package es.tecnilogica.ejercicios;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su nombre");
		String nombre = sc.nextLine();

		System.out.println("¡ Hola " + nombre + "!");
		sc.close();

	}

}
