package es.cic.ejerc006;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionService {

    private final AlmacenDatos almacenDatos;

    @Autowired
    public SesionService(AlmacenDatos almacenDatos) {
        this.almacenDatos = almacenDatos;
    }

    public Sesion crearSesion(Sesion sesion) {
        return almacenDatos.crearSesion(sesion);
       
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
