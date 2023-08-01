package es.cic.ejerc007;

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
@RequestMapping("/peliculas")
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;

	@GetMapping(path="/obtenerPeliculas")	
    public List<Pelicula> obtenerPeliculas() {
        return peliculaService.obtenerPeliculas();
    }

	@GetMapping(path="/obtenerPeliculaPorId/{id}")		
    public  Pelicula  obtenerPeliculaPorId(@PathVariable Long id) {	
		 return peliculaService.obtenerPeliculaPorId(id);
    }
    
	 @PostMapping("/crearPelicula")
	    public Pelicula crearPelicula(@RequestBody Pelicula pelicula) {
	        return peliculaService.crearPelicula(pelicula);
	    }

	 @PutMapping("/actualizarPelicula/{id}")
	    public Pelicula actualizarPelicula(@PathVariable Long id, @RequestBody Pelicula peliculaActualizada) {
	        return peliculaService.actualizarPelicula(peliculaActualizada);
	    }
    
	@DeleteMapping("/borrarPelicula/{id}")
    public void borrarPelicula(@PathVariable Long id) {
    	peliculaService.borrarPelicula(id);
    }	
	
}
