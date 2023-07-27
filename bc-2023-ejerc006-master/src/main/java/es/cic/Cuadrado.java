package es.cic;

import es.cic.ejerc006.Figura;

public class Cuadrado extends Figura implements Redimensionable<Double> {
    private double diagonal;

    public Cuadrado(int id, Posicion posicion, String color, double diagonal) {
        super(id, posicion, color);
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

	@Override
	public FiguraEnum getTipo() {
		return FiguraEnum.Cuadrado;
	}

	@Override
	public void cambiarTamano(Double diagonal) {
		this.diagonal = diagonal;
		
	}
}
