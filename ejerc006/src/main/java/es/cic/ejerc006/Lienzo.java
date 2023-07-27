package es.cic.ejerc006;

import java.util.ArrayList;
import java.util.List;

public class Lienzo {
    private List<Figura> figuras;

    public Lienzo() {
        figuras = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}