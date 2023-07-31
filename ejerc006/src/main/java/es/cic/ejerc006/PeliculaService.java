package es.cic.ejerc006;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {
	
	
	@Autowired
    private AlmacenDatos almacenDatos;
	 
	  public Pelicula crearPelicula(Pelicula pelicula) {
	        almacenDatos.crearPelicula(pelicula);
	        return pelicula;
	    }

	    public List<Pelicula> obtenerPeliculas() {
	        return almacenDatos.obtenerPeliculas();
	    }

	    public Pelicula obtenerPeliculaPorId(Long idPelicula) {
	    	 return almacenDatos.obtenerPeliculaPorId(idPelicula);
	         
	    }

	    public Pelicula actualizarPelicula(Pelicula peliculaModificada) {
	        almacenDatos.actualizarPelicula(peliculaModificada);
			return peliculaModificada;
			
	    }

	    public void borrarPelicula(Long idPelicula) {
	        almacenDatos.borrarPelicula(idPelicula);
	    }
}
