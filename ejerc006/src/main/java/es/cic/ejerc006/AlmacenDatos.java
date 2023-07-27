package es.cic.ejerc006;

import java.util.ArrayList;
import java.util.List;

public class AlmacenDatos {
	
	private List<VentaEntrada> ventasEntradas;

    public AlmacenDatos() {
        ventasEntradas = new ArrayList<>();
    }

    public void agregarVentaEntrada(VentaEntrada ventaEntrada) {
        ventasEntradas.add(ventaEntrada);
    }

    public List<VentaEntrada> obtenerVentasEntradas() {
        return ventasEntradas;
    }
}
