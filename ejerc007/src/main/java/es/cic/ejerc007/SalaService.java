package es.cic.ejerc007;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {
	
		@Autowired
		 private  AlmacenDatos almacenDatos;

		 public Sala crearSala(Sala sala) {
		        almacenDatos.crearSala(sala);	       
		        return sala;
		    }
	    public List<Sala> obtenerSalas() {
	        return almacenDatos.obtenerSalas();
	    }

	    public Sala obtenerSalaPorId(Long id) {
	        return almacenDatos.obtenerSalaPorId(id);
	    }
	   
	    public Sala actualizarSala(Sala salaActualizada) {
	         almacenDatos.actualizarSala(salaActualizada);
	         return salaActualizada;
	    }

	    public void borrarSala(Long idSala) {
	        almacenDatos.borrarSala(idSala);
	    }
}


