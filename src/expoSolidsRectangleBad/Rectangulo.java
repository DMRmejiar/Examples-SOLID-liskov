package expoSolidsRectangleBad;

public class Rectangulo {
	
	private int ancho;
	private int alto;
	
	public Rectangulo() {
		this.ancho = 1;
		this.alto = 1;
	}

	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public int calcularArea() {
		int area = this.alto*this.ancho;
		return area;
	}
}
