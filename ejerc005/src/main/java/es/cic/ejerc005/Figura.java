package es.cic.ejerc005;

public abstract class Figura {
	// propiedades de figura 
	private String tipo;
	private int posicionX;
    private int posicionY;
    private String color;
    private int longitud; // propiedad de solo lectura informativa

    // constructor
    public Figura(String tipo, int posicionX, int posicionY, String color) {
    	this.setTipo(tipo);
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }
    // set y get coordenadas
    public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}	
	public int getPosicionX(){
        return posicionX;
    }
    public int getPosicionY() {
        return posicionY;
    }

    // set y get de propiedad color
    public void setColor(String color) {
		this.color = color;
	}
    public String getColor() {
        return color;
    }
    
    // set y get del tipo de figura 
    public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	// get de longitud de solo lectura al ser calculado en la clase que lo implementa
	public int getLongitud() {
		return longitud;
	}
    
  
}
