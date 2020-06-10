package es.tecnilogica.ejercicios;

public class Coche {

	private int numeroPuertas;
	private String marca;
	private String modelo;
	private String color;
	private float cilindrada;

	public static void main(String[] args) {
		String str = "cadenita";
		int longitud = str.length();
		NumeroTelefonico.comprobarLongitud(longitud, NumeroTelefonico.MIN_CARACTER, NumeroTelefonico.MAX_CARACTER);
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cilindrada);
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + numeroPuertas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (Float.floatToIntBits(cilindrada) != Float.floatToIntBits(other.cilindrada))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (numeroPuertas != other.numeroPuertas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coche [cilindrada=" + cilindrada + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ ", numeroPuertas=" + numeroPuertas + "]";
	}

}
