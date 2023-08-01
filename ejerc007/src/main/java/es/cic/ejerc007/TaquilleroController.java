package es.cic.ejerc007;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taquilleros")
public class TaquilleroController {

    @Autowired
    private TaquilleroService taquilleroService;

    @PostMapping("/crear")
    public Taquillero crearTaquillero(@RequestBody Taquillero taquillero) {
        return taquilleroService.crearTaquillero(taquillero);
    }

    @GetMapping("/obtener-todos")
    public List<Taquillero> obtenerTaquilleros() {
        return taquilleroService.obtenerTaquilleros();
    }

    @GetMapping("/obtener-por-id/{id}")
    public Taquillero obtenerTaquilleroPorId(@PathVariable Long id) {
        return taquilleroService.obtenerTaquilleroPorId(id);
    }

    @PutMapping("/actualizar/{id}")
    public Taquillero actualizarTaquillero(@RequestBody Taquillero taquilleroActualizado) {
        return taquilleroService.actualizarTaquillero(taquilleroActualizado);
    }

    @DeleteMapping("/eliminar/{id}")
    public void borrarTaquillero(@PathVariable Long id) {
        taquilleroService.borrarTaquillero(id);
    }
}