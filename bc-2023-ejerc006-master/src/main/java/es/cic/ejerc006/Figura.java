package es.cic.ejerc006;

import es.cic.FiguraEnum;
import es.cic.Posicion;

public abstract class Figura {
    private int id;
	private Posicion posicion;
	private String color;

    public Figura() {
    	
    }
    
    public Figura(int i, Posicion posicion, String color) {
    	this.id = id;
    	this.posicion = posicion;
    	this.color = color;
    }
    
    public abstract FiguraEnum getTipo();
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

	public Posicion getPosicion() {
	    return posicion;
	}

	public void setPos(Posicion posicion) {
	    this.posicion = posicion;
	}

	public String getColor() {
	    return color;
	}

	public void setColor(String color) {
	    this.color = color;
	}
}
