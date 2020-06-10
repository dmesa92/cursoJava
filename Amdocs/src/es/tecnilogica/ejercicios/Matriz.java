package es.tecnilogica.ejercicios;

public class Matriz {

	public static void main(String[] args) {

		int cont = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (cont <= 9) {
					System.out.print(" ");
					System.out.print(" " + cont++);
					System.out.print(" ");
				} else {
					if (cont >= 100) {
						System.out.print(cont++);
					} else {
						System.out.print(" " + cont++);
					}
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}

}
