package es.cic;

import es.cic.ejerc006.Figura;

public class Punto extends Figura {

	public Punto() {
		
	}
	
	public Punto(int id, Posicion posicion, String color) {
		super(id, posicion, color);
	}

	@Override
	public FiguraEnum getTipo() {
		return FiguraEnum.Punto;
	}
}
