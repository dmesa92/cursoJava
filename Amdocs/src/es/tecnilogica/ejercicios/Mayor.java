package es.tecnilogica.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mayor {
	public static final String ERROR_CARACTER = "El caracter introducido no es el esperado";

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			// PREPARACION DE EJERCICIO
			sc = new Scanner(System.in);
			System.out.println("Introduce un numero \n");
			int numero = sc.nextInt();
			System.out.println("\n");
			// LOGICA DE EJERCICIO
			for (int i = numero; i <= 200; i++) {
				if (i % 3 == 0)
					System.out.println(i + " es múltiplo de 3");
			}

		} catch (InputMismatchException e) {
			System.out.println("\n" + ERROR_CARACTER);

		} finally {
			sc.close();
		}

	}
}
