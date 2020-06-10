package es.tecnilogica.ejercicios;

public class Principal {

	public static void main(String[] args) {
		String str = "cadenita";
		int longitud = str.length();
		boolean check = NumeroTelefonico.comprobarLongitud(longitud, NumeroTelefonico.MIN_CARACTER,
				NumeroTelefonico.MAX_CARACTER);
		System.out.println(check);

		Coche coche = new Coche();
		coche.setCilindrada(5000);

		Coche coche2 = new Coche();
		coche.setCilindrada(5000);

		if (coche.equals(coche2)) {
			System.out.println(coche);
		} else {
			System.out.println(coche2);
		}
	}

}
