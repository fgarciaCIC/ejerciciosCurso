package es.cic.ejerc006;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionService {

    private final AlmacenDatos almacenDatos;
    
    @Autowired
    private PeliculaService peliculaService;

    @Autowired
    private SalaService salaService;

    @Autowired
    public SesionService(AlmacenDatos almacenDatos) {
        this.almacenDatos = almacenDatos;
    }

    public Sesion crearSesion(Sesion sesion) {
    	  	
    	
    	 // Obtener la película por su ID
     //  Pelicula pelicula = peliculaService.obtenerPeliculaPorId(sesion.getPelicula().getId());

        // Obtener la sala por su ID
     //   Sala sala = salaService.obtenerSalaPorId(sesion.getSala().getId());

        // Asociar la película y la sala a la sesión
    //    sesion.setPelicula(pelicula);
     //   sesion.setSala(sala);

        // Aquí puedes implementar la lógica para guardar la nueva sesión en tu almacén de datos
        almacenDatos.crearSesion(sesion);

        return sesion;
    	
    	
      //  return almacenDatos.crearSesion(sesion);
       
    }

    public List<Sesion> obtenerSesiones() {
        return almacenDatos.obtenerSesiones();
    }

    public List<Sesion> obtenerSesionPorId(Long idSesion) {
    	 return almacenDatos.obtenerSesionPorId(idSesion);
    }

    public Sesion actualizarSesion(Sesion sesionActualizada) {
    	almacenDatos.actualizarSesion(sesionActualizada);
    	return sesionActualizada;
    }

    public void borrarSesion(Long idSesion) {
        almacenDatos.borrarSesion(idSesion);
    }
}
