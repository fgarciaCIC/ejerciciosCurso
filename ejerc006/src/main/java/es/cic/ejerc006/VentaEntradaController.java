package es.cic.ejerc006;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

		
@RestController
@RequestMapping("/venta")
public class VentaEntradaController {
	
			
		@Autowired
		private VentaEntradaService ventaEntradaService;

		  @PostMapping("/crear")
		    public VentaEntrada crearVentaEntrada(@RequestBody VentaEntrada ventaEntrada) {
		        return ventaEntradaService.crearVentaEntrada(ventaEntrada);
		    }

		    @GetMapping("/obtener-todas")
		    public List<VentaEntrada> obtenerVentasEntradas() {
		        return ventaEntradaService.obtenerVentasEntradas();
		    }

		    @GetMapping("/obtener-por-id/{id}")
		    public VentaEntrada obtenerVentaPorId(@PathVariable Long id) {
		        return ventaEntradaService.obtenerVentaPorId(id);
		    }

		    @PutMapping("/actualizar/{id}")
		    public VentaEntrada actualizarVentaEntrada(@RequestBody VentaEntrada ventaActualizada) {
		        return ventaEntradaService.actualizarVentaEntrada(ventaActualizada);
		    }

		    @DeleteMapping("/eliminar/{id}")
		    public void borrarVentaEntrada(@PathVariable Long id) {
		        ventaEntradaService.borrarVentaEntrada(id);
		    }

	  

}