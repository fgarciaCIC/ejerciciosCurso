package es.cic.ejerc006;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaEntradaService {
	
	@Autowired
    private AlmacenDatos almacenDatos;

	 public VentaEntrada crearVentaEntrada(VentaEntrada ventaEntrada) {
	        return almacenDatos.crearVentaEntrada(ventaEntrada);
	    }

	    public List<VentaEntrada> obtenerVentasEntradas() {
	        return almacenDatos.obtenerVentasEntradas();
	    }

	    public VentaEntrada obtenerVentaPorId(Long id) {
	        return almacenDatos.obtenerVentaPorId(id);
	    }

	    public VentaEntrada actualizarVentaEntrada(VentaEntrada ventaActualizada) {
	        return almacenDatos.actualizarVentaEntrada(ventaActualizada);
	    }

	    public void borrarVentaEntrada(Long id) {
	        almacenDatos.borrarVentaEntrada(id);
	    }
}
	
	