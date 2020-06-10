package es.tecnilogica.ejercicios;

public class Piramide {

	public static void main(String[] args) {

		int altura = 10;
		for (int numeroespacios = altura, numeros = 1; numeros <= (altura * 2) - 1; numeroespacios--, numeros += 2) {
			// Espacios
			for (int i = 0; i < numeroespacios; i++) {
				System.out.print(" ");
			}
			// numeros
			for (int j = numeros; j != 0; j--) {
				if (j % 2 == 0)
					System.out.print("1");
				else
					System.out.print("0");

			}
			System.out.println("");
		}
		
	}
}
