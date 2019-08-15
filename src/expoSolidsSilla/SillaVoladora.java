package expoSolidsSilla;

public class SillaVoladora extends Silla {
    
    private float velocidadDeVuelo;
    
    public float getVelocidadDeVuelo() {
		return velocidadDeVuelo;
	}

	public void setVelocidadDeVuelo(float velocidadDeVuelo) {
		this.velocidadDeVuelo = velocidadDeVuelo;
	}

	public SillaVoladora(boolean comoda, float velocidad) {
        super(comoda);
        this.velocidadDeVuelo = velocidad;
    }
    
    public String volar() {
        return "Estoy volando a "+this.velocidadDeVuelo+" metros por segundo";
    }
}