package es.cic.ejerc006;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaEntradaService {
	
	@Autowired
    private AlmacenDatos almacenDatos;

    public VentaEntrada realizarVenta(VentaEntrada ventaEntrada) {
        int cantidadEntradas = ventaEntrada.getCantidad();

        // Calcular el precio total
        double precioUnitario = 5.0; // Precio unitario de cada entrada
        double precioTotal = precioUnitario * cantidadEntradas;

        // Aplicar descuento del 10% si son más de 5 entradas
        if (cantidadEntradas > 5) {
            double descuento = precioTotal * 0.1;
            precioTotal -= descuento;
        }

        // Establecer el precio total en la venta de entrada
        ventaEntrada.setTotalVenta(precioTotal);

        // Guardar la venta de entrada en el AlmacenDatos
        almacenDatos.agregarVentaEntrada(ventaEntrada);

        return ventaEntrada;
    }

    public List<VentaEntrada> obtenerVentasEntradas() {
        return almacenDatos.obtenerVentasEntradas();
    }
}
	
	