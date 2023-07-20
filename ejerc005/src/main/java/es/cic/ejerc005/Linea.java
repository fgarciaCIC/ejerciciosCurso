package es.cic.ejerc005;

public class Linea extends Figura {
	// La Propiedad de centro es la coordenada x e y heredada de figura 
    // Las coordenadas de final son propiedades privadas de lineas 
	private int coordenadaFinalX;
    private int coordenadaFinalY;   

    public Linea(String tipo, int posicionX, int posicionY, String color, int coordenadaFinalX, int coordenadaFinalY) {
        super("Linea", posicionX, posicionY, color);
        this.coordenadaFinalX = coordenadaFinalX;
        this.coordenadaFinalY = coordenadaFinalY;       
    }
    
    // get set de coordenada final
    public int getCoordenadaFinalX() {
        return coordenadaFinalX;
    }
    public int getCoordenadaFinalY() {
        return coordenadaFinalY;
    }
    public void setCoordenadaFinalX(int coordenadaFinalX) {
        this.coordenadaFinalX = coordenadaFinalX;
    }
    public void setCoordenadaFinalY(int coordenadaFinalY) {
        this.coordenadaFinalY = coordenadaFinalY;
    }    
    
    // Devuelve el tipo
	public String getTipo() {
		return ("Linea");
	}		
	// calculo de longitud de linea según formula math
	 @Override
	    public int getLongitud() {
		 // Cálculo de la longitud utilizando la fórmula de distancia entre dos puntos
	        int diferenciaX = coordenadaFinalX - this.getPosicionX();
	        int diferenciaY = coordenadaFinalY - this.getPosicionY();
	        return ((int) Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY));
	    } 

	 

}
