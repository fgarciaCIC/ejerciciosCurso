package es.cic.ejerc006;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;

	public PeliculaController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping(path="/obtenerPeliculas")	
    public List<Pelicula> obtenerPeliculas() {
        return peliculaService.obtenerPeliculas();
    }

	@GetMapping(path="/obtenerPeliculaPorId")		
    public Pelicula obtenerPeliculaPorId(Long id) {
		 return peliculaService.obtenerPeliculaPorId(id);
    }
    
	@PostMapping("/crearPelicula")
    public Pelicula crearPelicula(Pelicula pelicula) {	       
    	 return peliculaService.crearPelicula(pelicula);
    }

	@PutMapping("/actualizarPelicula/{id}")
    public Pelicula actualizarPelicula(Long id, Pelicula peliculaActualizada) {
		 return peliculaService.actualizarPelicula(id, peliculaActualizada);
	 }		 

	@DeleteMapping("/borrarPelicula/{id}")
    public void borrarPelicula(Long id) {
    	peliculaService.borrarPelicula(id);
    }	

		
    //	@GetMapping(path="/ping")
	//public String ping() {		
	//	return "Hola mundo";
	//}

	
}
