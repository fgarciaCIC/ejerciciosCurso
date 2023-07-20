package es.cic.ejerc005;

public class Punto extends Figura{
	
     // Constructor
     public Punto(String tipo, int posicionX, int posicionY, String color) {
        super("Punto", posicionX, posicionY, color);
    }
	     
	  // Devuelve el tipo
	 	public String getTipo() {
	 		return ("Punto");
	 	}	
	  // la longitud es 1 punto
		 @Override
		    public int getLongitud() {
		        return (1);
		    }

	  
}
