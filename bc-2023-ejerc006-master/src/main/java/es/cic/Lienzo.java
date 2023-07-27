package es.cic;

import java.util.ArrayList;
import java.util.List;

import es.cic.ejerc006.Figura;

public class Lienzo {
    private List<Figura> figuras;
  

    private static final int LIENZO_MAX_X=1000000,LIENZO_MAX_Y=1000000;

    public Lienzo() {
        this.figuras = new ArrayList<>();
    }

    public void pintar(Figura figura){
    	if (noEstaDentro(figura.getPosicion())) {
			throw new LienzoException("Figura fuera de los limites", figura); 
    	}
		if (isIdDuplicado(figura)) {
			throw new LienzoException("id de figura duplicado", figura);
		}
    	
		figuras.add(figura);
    }


    public void mover(Figura figura, Posicion nuevaPosicion){
    	if (noEstaDentro(nuevaPosicion)) {
			throw new LienzoException(
					String.format("Nueva posicion %d, %d, fuera de los limites", nuevaPosicion.getPosX(), nuevaPosicion.getPosY()), 
					figura); 
    	}
    	
    	figura.setPos(nuevaPosicion);
    }

	public void cambiar(Redimensionable figura, Object tamano) {
		figura.cambiarTamano(tamano);
	}


	public boolean isRedimensionable(Figura figura) {
		return Redimensionable.class.isAssignableFrom(figura.getClass());
	}
	
	
    public void eliminarFigura(int id){
        for(int i = 0 ; i < figuras.size(); i++) {
        	if (figuras.get(i).getId() == id) {
        		figuras.remove(id);
        		return;
        	}
        }
        	
//    	
//        Figura aEliminar = null;
//        for (Figura f: figuras) {
//    		if (f.getId() == id) {
//    			aEliminar = f;
//    			break;
//    		}
//    	  }
//        if (aEliminar != null) {
//        	figuras.remove(aEliminar);
//        }
//        
    }

    

	private boolean isIdDuplicado(Figura figura) {
		for (int i = 0 ; i < figuras.size(); i++) {
			if (figuras.get(i).getId() == figura.getId()) {
				return true;
			}
		}
		return false;
	}

    private boolean noEstaDentro(Posicion posicion){
        if(posicion.getPosX()<LIENZO_MAX_X || posicion.getPosY()<LIENZO_MAX_Y){
            return false;
        }else{
            return true;
        }
    }
	
	public List<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(List<Figura> figuras) {
		this.figuras = figuras;
	}
    

}
