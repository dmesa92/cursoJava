package es.tecnilogica.ejercicios;

import java.util.Scanner;

public class NumeroTelefonico {
	public static final String FIN_PROGRAMA = "fin";
	public static final String ERROR_NUMERO_NO_VALIDO = "El numero introducido no es valido\n";
	public static final String NUMERO_VALIDO = "El numero introducido es valido\n";
	/**
	 * Minimo de caracteres que puede tener una cadena
	 */
	public static final int MIN_CARACTER = 10;
	public static final int MAX_CARACTER = 20;
	/**
	 * Maximo de caracteres que puede tener una cadena
	 */

	public static final char SUMA_CARACTER = '+';

	/**
	 * Metodo que comprueba si la longitud de una cadena es la deseada
	 * 
	 * @param Longitud de la cadena
	 * @return true si la longitud está establecida entre cantidad minima y maxima
	 */
	protected static boolean comprobarLongitud(int longitud, int minimo, int maximo) {
		return longitud >= minimo && longitud <= maximo;
	}

	/**
	 * Metodo que comprueba la primera letra de la cadena
	 * 
	 * @param cadena
	 * @return true si el primer caracter de la cadena es el que queremos
	 */
	public static boolean comprobarPrimerCaracter(String cadena) {
		char primerCaracter = cadena.charAt(0);
		return (primerCaracter == SUMA_CARACTER || Character.isDigit(primerCaracter));
	}

	/**
	 * Metodo que comprueba si todos los caracteres introducidos son numeros o
	 * espacios
	 * 
	 * @param Cadena
	 * @param Longitud de la cadena
	 * @return true si la longitud está establecida entre cantidad minima y maxima
	 */
	public static boolean comprobarLetras(String cadena, int longitud) {
		int cont = 0;
		boolean flag = true;
		char caracter;
		// Mientras no encontremos una letra recorreremos todas las posiciones.
		while (cont < longitud && flag) {
			caracter = cadena.charAt(cont);
			if (Character.isLetter(caracter)) {
				flag = false;
			}
			cont++;
		}
		return flag;
	}

	/**
	 * Metodo que imprime por pantalla si el numero introducido es valido
	 * 
	 * @param Cadena
	 * @return true si es numero permitido
	 */
	private static void isValid(String cadena) {
		int longitud = cadena.length();
		// Iniciamos la cadena a imprimir como negativa si las condiciones se cumplen,
		// se modificara
		String cadenaReturn = ERROR_NUMERO_NO_VALIDO;
		if (comprobarLongitud(longitud, MIN_CARACTER, MAX_CARACTER) && comprobarPrimerCaracter(cadena)
				&& comprobarLetras(cadena, longitud)) {
			cadenaReturn = NUMERO_VALIDO;
		}
		System.out.println(cadenaReturn);

	}

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String cadena = "";
			do {
				System.out.println("Introduce un número de teléfono que tenga entre " + MIN_CARACTER + " y "
						+ MAX_CARACTER + " caractéres");
				cadena = sc.nextLine();
				if (cadena != null && !cadena.equalsIgnoreCase(FIN_PROGRAMA)) {
					isValid(cadena);
				}

			} while (!cadena.equalsIgnoreCase(FIN_PROGRAMA));
		} finally {
			sc.close();
		}

	}

}
