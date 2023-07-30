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
@RequestMapping("/sesiones")
public class SesionController {
	
	@Autowired
	private SesionService sesionService;

	@GetMapping("/obtenerSesiones")	
    public List<Sesion> obtenerSesiones() {
        return sesionService.obtenerSesiones();
    }

	@GetMapping("/obtenerSesionPorId/{id}")		
    public List<Sesion>  obtenerSesionPorId(@PathVariable Long id) {	
		 return sesionService.obtenerSesionPorId(id);
    }
    
	@PostMapping("/crearSesion")
    public Sesion crearSesion(@RequestBody Sesion sesion) {
        return sesionService.crearSesion(sesion);
    }

	@PutMapping("/actualizarSesion/{id}")
    public Sesion actualizarSesion(@PathVariable Long id, @RequestBody Sesion sesionActualizada) {
        return sesionService.actualizarSesion(sesionActualizada);
    }

	@DeleteMapping("/borrarSesion/{id}")
    public void borrarSesion(@PathVariable Long id) {
    	sesionService.borrarSesion(id);
    }	
}

