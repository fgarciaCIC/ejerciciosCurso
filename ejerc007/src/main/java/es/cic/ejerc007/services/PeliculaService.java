package es.cic.ejerc007.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.ejerc007.AlmacenDatos;
import es.cic.ejerc007.models.Pelicula;

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
