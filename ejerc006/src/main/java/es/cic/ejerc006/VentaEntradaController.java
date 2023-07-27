package es.cic.ejerc006;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

		
@RestController
@RequestMapping("/venta")
public class VentaEntradaController {
	
			
		@Autowired
		private VentaEntradaService ventaEntradaService;

		  // Método GET para obtener todas las ventas de entradas
	    @GetMapping("/todasLasVentas")
	    public List<VentaEntrada> obtenerVentasEntradas() {
	        return ventaEntradaService.obtenerVentasEntradas();
	    }
	    
		 // Método POST para realizar la venta de entradas
	    @PostMapping("/realizarVenta")
	    public VentaEntrada realizarVenta(VentaEntrada ventaEntrada) {
	        return ventaEntradaService.realizarVenta(ventaEntrada);
	    }

	  

}