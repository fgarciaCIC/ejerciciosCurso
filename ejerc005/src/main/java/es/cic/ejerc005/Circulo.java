package es.cic.ejerc005;

public class Circulo extends Figura{
	// La Propiedad de centro es la coordenada x e y heredada de figura 
	// que se inicializa en el constructor, al igual que tipo y color
	
	//	Propiedad radio es específica de Circulo
	private int radio;

	// constructor de Círculo
    public Circulo(String tipo, int posicionX, int posicionY, String color, int radio) {
        super("Circulo",posicionX, posicionY, color);
        this.radio = radio;
    }
    
    // Get set de propiedad radio
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
 // Devuelve el tipo
 	public String getTipo() {
 		return ("Circulo");
 	}

    // Get  de propiedad longitd 
    // (Se podría poner un cálculo pero se toma el radio como medida).      
    @Override
    public int getLongitud() {
        return (radio);
    }

}
