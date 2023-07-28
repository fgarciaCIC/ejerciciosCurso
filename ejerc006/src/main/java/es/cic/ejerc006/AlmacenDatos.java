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

    public AlmacenDatos() {
        ventasEntradas = new ArrayList<>();
        peliculas = new ArrayList<>();
        taquilleros = new ArrayList<>();
        salas = new ArrayList<>();
    }
    
    // Métodos CRUD a nivel de Repositorio de Venta de Entradas
    public void agregarVentaEntrada(VentaEntrada ventaEntrada) {
        ventasEntradas.add(ventaEntrada);
    }

    public void modificarVentaEntrada(VentaEntrada ventaEntradaModificada) {
        // Encuentra la venta de entrada por su ID y actualiza sus datos
        for (VentaEntrada ventaEntrada : ventasEntradas) {
            if (ventaEntrada.getId().equals(ventaEntradaModificada.getId())) {
                ventaEntrada.setCantidad(ventaEntradaModificada.getCantidad());
                ventaEntrada.setPrecioUnitario(ventaEntradaModificada.getPrecioUnitario());
                ventaEntrada.setDescuento(ventaEntradaModificada.getDescuento());
                ventaEntrada.setTotalVenta(ventaEntradaModificada.getTotalVenta());
                ventaEntrada.setSesion(ventaEntradaModificada.getSesion());
                break;
            }
        }
    }
    
    public void eliminarVentaEntrada(Long idVentaEntrada) {
        // Encuentra la venta de entrada por su ID y elimínala
        ventasEntradas.removeIf(ventaEntrada -> ventaEntrada.getId().equals(idVentaEntrada));
    }
    
    public List<VentaEntrada> obtenerVentasEntradas() {
        return ventasEntradas;
    }
    
 // Métodos para crud Salas
    
    public List<Sala> getSalas() {
        return salas;
    }

    public List<Sala> obtenerSalaPorId(Long id) {
        List<Sala> salasEncontradas = new ArrayList<>();
        for (Sala sala : salas) {
            if (sala.getId().equals(id)) {
                salasEncontradas.add(sala);
            }
        }
        return salasEncontradas;
    }

    public Sala agregarSala(Sala sala) {
        salas.add(sala);
        return sala;
    }

    public Sala actualizarSala(Long id, Sala salaActualizada) {
        List<Sala> salasEncontradas = obtenerSalaPorId(id);
        if (!salasEncontradas.isEmpty()) {
            Sala salaExistente = salasEncontradas.get(0);
            // Actualizar los atributos de la sala existente con los valores de la sala actualizada
            salaExistente.setNombre(salaActualizada.getNombre());
            salaExistente.setAforo(salaActualizada.getAforo());
            return salaExistente;
        } else {
            return null; // Devolver null si no se encontró la sala con el ID proporcionado
        }
    }
    public boolean eliminarSala(Long id) {
        List<Sala> salasEncontradas = obtenerSalaPorId(id);
        if (!salasEncontradas.isEmpty()) {
            salas.removeAll(salasEncontradas);
            return true;
        } else {
            return false; // Devolver false si no se encontró la sala con el ID proporcionado
        }
    }
    
 // Métodos para Pelicula
    
    public List<Pelicula> obtenerPeliculas() {
        return peliculas;
    }
    
    public List<Pelicula> obtenerPeliculaPorId(Long identificador) {
        ArrayList<Pelicula> resultado = new ArrayList<Pelicula>();
       
        for (Pelicula pelicula : peliculas) {        	
            if (pelicula.getId().equals(identificador)) {
            	
                resultado.add(pelicula);
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
    
    
    
    // Métodos para Taquillero
    public void agregarTaquillero(Taquillero taquillero) {
        taquilleros.add(taquillero);       
        
    }
    
    public void modificarTaquillero(Taquillero taquilleroModificado) {
        // Encuentra el taquillero por su ID y actualiza sus datos
        for (Taquillero taquillero : taquilleros) {
            if (taquillero.getId().equals(taquilleroModificado.getId())) {
                taquillero.setNombre(taquilleroModificado.getNombre());
                taquillero.setApellido(taquilleroModificado.getApellido());
                
                break;
            }
        }
    }

    public void eliminarTaquillero(Long idTaquillero) {
        // Encuentra el taquillero por su ID y elimínalo
        taquilleros.removeIf(taquillero -> taquillero.getId().equals(idTaquillero));
    }
    

    public List<Taquillero> obtenerTodosLosTaquilleros() {
        return taquilleros;
    }

}
