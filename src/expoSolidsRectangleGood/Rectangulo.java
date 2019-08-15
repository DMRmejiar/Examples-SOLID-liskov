package expoSolidsRectangleGood;

public class Rectangulo implements IRectangulo {
	
	private int alto;
	private int ancho;
	
	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public Rectangulo() {
		this.alto = 1;
		this.ancho = 1;
	}

	@Override
	public int getAncho() {
		return this.ancho;
	}

	@Override
	public int getAlto() {
		return this.alto;
	}

	@Override
	public int calcularArea() {
		int area = this.alto * this.ancho;
		return area;
	}

}
