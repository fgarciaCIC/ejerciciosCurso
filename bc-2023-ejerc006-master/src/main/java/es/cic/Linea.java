package es.cic;

import es.cic.ejerc006.Figura;

public class Linea extends Figura implements Redimensionable<Posicion> {

	private Posicion puntoFinal;
	
	public Linea() {
		
	}
	
	public Linea(int i, Posicion posicion, String color, Posicion puntoFinal) {
		super(i, posicion, color);
		this.puntoFinal = puntoFinal;
	}

	public Posicion getPuntoFinal() {
		return puntoFinal;
	}

	public void setPuntoFinal(Posicion puntoFinal) {
		this.puntoFinal = puntoFinal;
	}

	@Override
	public FiguraEnum getTipo() {
		return FiguraEnum.Linea;
	}

	@Override
	public void cambiarTamano(Posicion posicionFinal) {
		this.getPuntoFinal().setPosX(posicionFinal.getPosX());
		this.getPuntoFinal().setPosY(posicionFinal.getPosY());
	}
}
