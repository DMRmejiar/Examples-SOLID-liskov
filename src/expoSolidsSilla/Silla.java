package expoSolidsSilla;

public class Silla {
    
    private boolean esComoda;
    
    public boolean isEsComoda() {
		return esComoda;
	}

	public void setEsComoda(boolean esComoda) {
		this.esComoda = esComoda;
	}

	public Silla() {
    	this.esComoda = false;	
    }
    
    public Silla(boolean comoda) {
        this.esComoda = comoda;
    }
    
    public String sentarse() {
        String texto;
        if (this.esComoda) {
            texto = "Es comodo sentarse";
        } else {
            texto = "No es comodo sentartse";
        }
        
        return texto;
    }
    
    public String recostarse() {
        String texto;
        if (this.esComoda) {
            texto = "Es comodo sentarse";
        } else {
            texto = "No es comodo sentartse";
        }
        return texto;
    }
}