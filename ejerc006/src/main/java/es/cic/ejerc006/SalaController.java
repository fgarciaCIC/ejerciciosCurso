package es.cic.ejerc006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

		
@RestController
@RequestMapping("/sala")
public class SalaController {
		
		@Autowired
		private SalaService salaService;

		@GetMapping("/obtenerSalas")
	    public List<Sala> obtenerSalas() {
	        return salaService.obtenerSalas();
	    }

	    @GetMapping("/obtenerSalaPorId/{id}")
	    public List<Sala> obtenerSalaPorId(@PathVariable Long id) {
	        return salaService.obtenerSalaPorId(id);
	    }

	    @PostMapping("/crearSala")
	    public Sala crearSala(@RequestBody Sala sala) {
	        return salaService.crearSala(sala);
	    }

	    @PutMapping("/actualizarSala/{id}")
	    public Sala actualizarSala(@PathVariable Long id, @RequestBody Sala salaActualizada) {
	        return salaService.actualizarSala(id, salaActualizada);
	    }

	    @DeleteMapping("/borrarSala/{id}")
	    public void borrarSala(@PathVariable Long id) {
	        salaService.borrarSala(id);
	    }

}
