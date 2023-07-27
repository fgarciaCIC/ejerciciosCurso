package es.cic.ejerc006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PeliculaService {
	
	 private Map<Long, Pelicula> peliculas = new HashMap<>();
	 private Long nextId = 1L;
	 
	    // Método para obtener todas las películas
	    public List<Pelicula> obtenerPeliculas() {
	        return new ArrayList<>(peliculas.values());
	    }
	
   	    // Método para obtener una película por su ID
	    public Pelicula obtenerPeliculaPorId(Long id) {
	        return peliculas.get(id);
	    }
	    

	    // Método para crear una nueva película
	    public Pelicula crearPelicula(Pelicula pelicula) {	       
			pelicula.setId(nextId);
	        peliculas.put(nextId, pelicula);
	        nextId++;
	        return pelicula;
	    }

	    // Método para actualizar una película existente
	    public Pelicula actualizarPelicula(Long id, Pelicula peliculaActualizada) {
	        Pelicula peliculaExistente = peliculas.get(id);
	        if (peliculaExistente != null) {
	            peliculaActualizada.setId(id);
	            peliculas.put(id, peliculaActualizada);
	            return peliculaActualizada;
	        }
	        return null;
	    }

	    // Método para borrar una película por su ID
	    public void borrarPelicula(Long id) {
	        peliculas.remove(id);
	    }	
	
}
