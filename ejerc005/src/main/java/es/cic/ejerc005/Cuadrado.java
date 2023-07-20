package es.cic.ejerc005;

public class Cuadrado extends Figura {
	// La Propiedad de centro es la coordenada x e y heredada de figura 
	// propiedad privada lado
	private int lado;

	// Constructor
    public Cuadrado(String tipo,int posicionX, int posicionY, String color, int lado) {
        super("Cuadrado", posicionX, posicionY, color);
        this.lado = lado;
    }
    
    // get set de lado
    public void setLado(int lado) {
		this.lado = lado;	}

	public int getLado() {
        return lado;
    }
	
	// Devuelve el tipo
		public String getTipo() {
			return ("Cuadrado");
		}
	
	// la longitud es el lado, que podría cambiar y por eso se deja la propiead lado
	 @Override
	    public int getLongitud() {
	        return (this.lado);
	    }

}
