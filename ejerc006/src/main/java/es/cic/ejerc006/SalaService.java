package es.cic.ejerc006;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {
	
		@Autowired
		 private  AlmacenDatos almacenDatos;


	    public List<Sala> obtenerSalas() {
	        return almacenDatos.getSalas();
	    }

	    public List<Sala> obtenerSalaPorId(Long id) {
	        return almacenDatos.obtenerSalaPorId(id);
	    }

	    public Sala crearSala(Sala sala) {
	        almacenDatos.getSalas().add(sala);
	        return sala;
	    }

	    public Sala actualizarSala(Long id, Sala salaActualizada) {
	        return almacenDatos.actualizarSala(id, salaActualizada);
	    }

	    public void borrarSala(Long id) {
	        almacenDatos.eliminarSala(id);
	    }
}


