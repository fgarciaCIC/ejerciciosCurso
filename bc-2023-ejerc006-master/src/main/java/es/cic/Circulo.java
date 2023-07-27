package es.cic;

import es.cic.ejerc006.Figura;

public class Circulo extends Figura implements Redimensionable<Double>{

    private double radio;
    public Circulo() {
    }
 
    public Circulo(int id, Posicion posicion, String color, double radio) {
        super(id, posicion, color);
    	this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

	@Override
	public FiguraEnum getTipo() {
		return FiguraEnum.Circulo;
	}

	@Override
	public void cambiarTamano(Double radio) {
		this.radio = radio;
	}
}