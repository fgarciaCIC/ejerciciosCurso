package es.cic.ejerc007.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.ejerc007.AlmacenDatos;
import es.cic.ejerc007.models.Taquillero;

@Service
public class TaquilleroService {

    @Autowired
    private AlmacenDatos almacenDatos;

    public Taquillero crearTaquillero(Taquillero taquillero) {
        return almacenDatos.crearTaquillero(taquillero);
    }

    public List<Taquillero> obtenerTaquilleros() {
        return almacenDatos.obtenerTaquilleros();
    }

    public Taquillero obtenerTaquilleroPorId(Long id) {
        return almacenDatos.obtenerTaquilleroPorId(id);
    }

    public Taquillero actualizarTaquillero(Taquillero taquilleroActualizado) {
        return almacenDatos.actualizarTaquillero(taquilleroActualizado);
    }

    public void borrarTaquillero(Long id) {
        almacenDatos.borrarTaquillero(id);
    }
}