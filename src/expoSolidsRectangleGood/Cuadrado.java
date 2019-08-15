package expoSolidsRectangleGood;

public class Cuadrado implements IRectangulo {

	private int lado;
	
	public Cuadrado() {

	}

	public Cuadrado(int lado) {
		this.lado = lado;
	}

	public void setAnchoYAlto(int lado) {
		this.lado = lado;
	}

	@Override
	public int getAncho() {
		return this.lado;
	}

	@Override
	public int getAlto() {
		return this.lado;
	}

	@Override
	public int calcularArea() {
		int area = this.lado * this.lado;
		return area;
	}

}
