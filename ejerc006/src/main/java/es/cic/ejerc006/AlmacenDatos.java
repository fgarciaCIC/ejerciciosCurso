package es.cic.ejerc006;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class AlmacenDatos {
	
	// Repositorio de datos como datos en memoria. 
	// Se representan las Entidades que serían como tablas de una BBDD
	private List<VentaEntrada> ventasEntradas;
	private List<Pelicula> peliculas;
    private List<Taquillero> taquilleros;
    private List<Sala>salas;
    private List<Sesion> sesiones;

    public AlmacenDatos() {
        ventasEntradas = new ArrayList<>();
        peliculas = new ArrayList<>();
        taquilleros = new ArrayList<>();
        salas = new ArrayList<>();
        sesiones = new ArrayList<>();
    }
    
    // Métodos CRUD a nivel de Repositorio de Venta de Entradas
    public VentaEntrada crearVentaEntrada(VentaEntrada ventaEntrada) {
        ventasEntradas.add(ventaEntrada);
        return ventaEntrada;
    }

    public VentaEntrada actualizarVentaEntrada(VentaEntrada ventaEntradaModificada) {
        // Encuentra la venta de entrada por su ID y actualiza sus datos
        for (VentaEntrada ventaEntrada : ventasEntradas) {
            if (ventaEntrada.getId().equals(ventaEntradaModificada.getId())) {
                ventaEntrada.setCantidad(ventaEntradaModificada.getCantidad());
                ventaEntrada.setPrecioUnitario(ventaEntradaModificada.getPrecioUnitario());
                ventaEntrada.setDescuento(ventaEntradaModificada.getDescuento());
                ventaEntrada.setTotalVenta(ventaEntradaModificada.getTotalVenta());
                ventaEntrada.setSesion(ventaEntradaModificada.getSesion());
                ventaEntrada.setTaquillero(ventaEntradaModificada.getTaquillero());
                
                return ventaEntrada;
           
            }
        }
        return null;
    }
    
    public void borrarVentaEntrada(Long idVentaEntrada) {
        // Encuentra la venta de entrada por su ID y elimínala
        ventasEntradas.removeIf(ventaEntrada -> ventaEntrada.getId().equals(idVentaEntrada));
    }
    
    public List<VentaEntrada> obtenerVentasEntradas() {
        return ventasEntradas;
    }
    
    public VentaEntrada obtenerVentaPorId(Long id) {
        for (VentaEntrada ventaEntrada : ventasEntradas) {
            if (ventaEntrada.getId().equals(id)) {
                return ventaEntrada;
            }
        }
        return null;
    }
    
 // Métodos para crud Salas
    
    public List<Sala> obtenerSalas() {
        return salas;
    }

    public Sala obtenerSalaPorId(Long id) {
        Sala salasEncontrada = new Sala();
        for (Sala sala : salas) {
            if (sala.getId().equals(id)) {
                return(sala);
            }
        }
        return null;
    }

    public Sala crearSala(Sala sala) {
        salas.add(sala);
        return sala;
    }

    public void actualizarSala(Sala salaActualizada) {
      for (int i = 0; i < peliculas.size(); i++) {
        Sala sala = salas.get(i);
        if (sala.getId().equals(salaActualizada.getId())) {
            // Se encontró la sala con el ID proporcionado, actualizar sus datos
            sala.setNombreSala(salaActualizada.getNombreSala());
            sala.setAforo(salaActualizada.getAforo());   
        }
      }
    }
    public boolean borrarSala(Long id) {
        Sala salaEncontrada = obtenerSalaPorId(id);
        if (salaEncontrada!=null) {
            salas.remove(salaEncontrada);
            return true;
        } else {
            return false; // Devolver false si no se encontró la sala con el ID proporcionado
        }
    }
    
 // Métodos para Pelicula
    
    public List<Pelicula> obtenerPeliculas() {
        return peliculas;
    }
    
    public Pelicula obtenerPeliculaPorId(Long identificador) {
        Pelicula resultado = new Pelicula();
       
        for (Pelicula pelicula : peliculas) {        	
            if (pelicula.getId().equals(identificador)) {
            	
                return pelicula;
            }
        }

        // Si se encontraron películas con el ID proporcionado, devolver la lista de coincidencias
        // Si no se encontraron películas, la lista estará vacía, lo que es mejor que devolver null
        return resultado;
    }

    
    public void crearPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }
    

    public void  actualizarPelicula(Pelicula peliculaActualizada) {
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            if (pelicula.getId().equals(peliculaActualizada.getId())) {
                // Se encontró la película con el ID proporcionado, actualizar sus datos
                pelicula.setTitulo(peliculaActualizada.getTitulo());
                pelicula.setGenero(peliculaActualizada.getGenero());
                pelicula.setDuracion(peliculaActualizada.getDuracion());
                pelicula.setReparto(peliculaActualizada.getReparto());

                // Indicar que la actualización fue exitosa y salir del bucle
               // return true;
            }
        }

        // Si no se encontró la película con el ID proporcionado, la actualización falló
     // false;
    }

    public void borrarPelicula(Long idPelicula) {
        // Encuentra la película por su ID y elimínala
        peliculas.removeIf(pelicula -> pelicula.getId().equals(idPelicula));
    }
    
 // Métodos para Sesion
    
    public List<Sesion> obtenerSesiones() {
        return sesiones;
    }
    
    public List<Sesion> obtenerSesionPorId(Long identificador) {
        ArrayList<Sesion> resultado = new ArrayList<Sesion>();
       
        for (Sesion sesion : sesiones) {        	
            if (sesion.getId().equals(identificador)) {
            	
                resultado.add(sesion);
            }
        }       
        return resultado;
    }

    
    public Sesion crearSesion(Sesion sesion) {
    	
    	// leer aforo de la sala
     //	 Sala sala= this.obtenerSalaPorId(sesion.getSala().getId());
     	 // comprobar que se puede resevar sesion     	    
    	// if (sala.getAforo()>0) {
    		  // restar del aforo de la sala correspondiente 1
       //      sala.setAforo(sala.getAforo()-1);
          //   this.actualizarSala(sala);          
    	// }
    	// else
    		// emitir aviso de foro lleno
    	
    	   		 
    		 
    		 
         // si todo ok guardar sesion
         sesiones.add(sesion);
        return sesion;
    }
    

    public void  actualizarSesion(Sesion sesionActualizada) {
        for (int i = 0; i < sesiones.size(); i++) {
            Sesion sesion = sesiones.get(i);
            if (sesion.getId().equals(sesionActualizada.getId())) {
                // Se encontró la sesion con el ID proporcionado, actualizar sus datos
                sesion.setFechaHora(sesionActualizada.getFechaHora());
               
               
            }
        }

    }

    public void borrarSesion(Long idSesion) {
        // Encuentra la sesion por su ID y elimínala
        sesiones.removeIf(sesion -> sesion.getId().equals(idSesion));
    }
    
    
    
    
    // Métodos para Taquillero
    public Taquillero crearTaquillero(Taquillero taquillero) {
        taquilleros.add(taquillero);   
        return taquillero;
        
    }
    
    public Taquillero actualizarTaquillero(Taquillero taquilleroModificado) {
        // Encuentra el taquillero por su ID y actualiza sus datos
        for (Taquillero taquillero : taquilleros) {
            if (taquillero.getId().equals(taquilleroModificado.getId())) {
                taquillero.setNombre(taquilleroModificado.getNombre());
                taquillero.setApellido(taquilleroModificado.getApellido());
                
                return taquilleroModificado;
            }
        }
        return null;
    }

    public void borrarTaquillero(Long idTaquillero) {
        // Encuentra el taquillero por su ID y elimínalo
        taquilleros.removeIf(taquillero -> taquillero.getId().equals(idTaquillero));
    }
    

    public List<Taquillero> obtenerTaquilleros() {
        return taquilleros;
    }
    
    public Taquillero obtenerTaquilleroPorId(Long id) {
        for (Taquillero taquillero : taquilleros) {
            if (taquillero.getId().equals(id)) {
                return taquillero;
            }
        }
        return null;
    }
    
    

}
