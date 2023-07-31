package es.cic.ejerc006;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaEntradaService {
	
	@Autowired
    private AlmacenDatos almacenDatos;

	 public VentaEntrada crearVentaEntrada(VentaEntrada ventaEntrada) {
	        return almacenDatos.crearVentaEntrada(ventaEntrada);
	    }

	    public List<VentaEntrada> obtenerVentasEntradas() {
	        return almacenDatos.obtenerVentasEntradas();
	    }

	    public VentaEntrada obtenerVentaPorId(Long id) {
	        return almacenDatos.obtenerVentaPorId(id);
	    }

	    public VentaEntrada actualizarVentaEntrada(VentaEntrada ventaActualizada) {
	        return almacenDatos.actualizarVentaEntrada(ventaActualizada);
	    }

	    public void borrarVentaEntrada(Long id) {
	        almacenDatos.borrarVentaEntrada(id);
	    }
	    
	    // Listados de numero de ventas (y detalle de sesiones) 
	    // y total vendido (y detalle ventas por sesion), 
	    // todos a una fecha
	    public int NumeroVentaEntrada(LocalDate fecha) {
	    	int contador=0;
	    	List<Sesion> sesionesPorFecha = new ArrayList<Sesion>();        	     
	        for (Sesion sesion : this.almacenDatos.obtenerSesiones()) {
	        	// filtrar por aquellas sesiones cuyo Date(fechahora) = fecha     			 
	            if (sesion.getFechaHora().toLocalDate().equals(fecha)) {
	                sesionesPorFecha.add(sesion);
	                contador++;
	            }
	        }
	        return contador;
	    }
	    public List<Sesion>  SesionesVentaEntrada(LocalDate fecha) {
	    	int contador=0;
	    	List<Sesion> sesionesPorFecha = new ArrayList<Sesion>();        	     
	        for (Sesion sesion : this.almacenDatos.obtenerSesiones()) {
	        	// filtrar por aquellas sesiones cuyo Date(fechahora) = fecha     			 
	            if (sesion.getFechaHora().toLocalDate().equals(fecha)) {
	                sesionesPorFecha.add(sesion);
	                
	            }
	        }
	        return sesionesPorFecha;
	    }
	    
	    public List<VentaEntrada> obtenerVentasPorSesion(Long idSesion) {
	    	
	    	 List<VentaEntrada> ventasPorSesion = new ArrayList<>();

	         List<VentaEntrada> todasLasVentas = almacenDatos.obtenerVentasEntradas(); // Suponiendo que hay un método para obtener todas las ventas del almacén

	         for (VentaEntrada venta : todasLasVentas) {
	             if (venta.getSesion().getId().equals(idSesion)) {
	                 ventasPorSesion.add(venta);
	             }
	         }

	         return ventasPorSesion;
	    }
	    
	    public double TotalVentaEntrada(LocalDate fecha) {
	    	Double totalVendido= 0.0;
	    	    
	    	List<VentaEntrada> ventasPorSesion = new ArrayList<>();
	    	  
	        for (Sesion sesion : this.almacenDatos.obtenerSesiones()) {
	        	// Filtrar por aquellas sesiones cuyo Date(fechahora) = fecha     			 
	            if (sesion.getFechaHora().toLocalDate().equals(fecha)) {
	               // buscar en ventas que tenga ese mismo número de sesión
	            	// guardarlas en ventasPorFecha
	            	List<VentaEntrada> ventasDeSesion = obtenerVentasPorSesion(sesion.getId());
	            	 for (VentaEntrada venta : ventasDeSesion) {	                   
	                        // ventasPorSesion.add(venta);
	                         totalVendido= totalVendido + venta.getTotalVenta();
	                     }	                   
	            }
	        }
	        return totalVendido;
	    }
	    public List<VentaEntrada> VentasEntradaPorSesion(LocalDate fecha) {
	    	Double totalVendido= 0.0;
	    	    
	    	List<VentaEntrada> ventasPorSesion = new ArrayList<>();
	    	  
	        for (Sesion sesion : this.almacenDatos.obtenerSesiones()) {
	        	// Filtrar por aquellas sesiones cuyo Date(fechahora) = fecha     			 
	            if (sesion.getFechaHora().toLocalDate().equals(fecha)) {
	               // buscar en ventas que tenga ese mismo número de sesión
	            	// guardarlas en ventasPorFecha
	            	List<VentaEntrada> ventasDeSesion = obtenerVentasPorSesion(sesion.getId());
	            	 for (VentaEntrada venta : ventasDeSesion) {	                   
	                         ventasPorSesion.add(venta);
	                        // totalVendido= totalVendido + venta.getTotalVenta();
	                     }	                   
	            }
	        }
	        return ventasPorSesion;
	    }
	    
}
	
	