package es.cic.ejerc006;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/figuras")
public class FiguraController {
    @Autowired
    private FiguraService figuraService;

    @GetMapping
    @RequestMapping("/{id}")
    public Figura get(@PathVariable("id") long id) {
        return figuraService.get(id);
    }

    @GetMapping
    public List<Figura> get() {
        return figuraService.get();
    }

    @PostMapping
    public long create(Figura figura) {
        return figuraService.create(figura);
    }

    @PutMapping
    public void update(Figura figura) {
        figuraService.update(figura);
    }

    @DeleteMapping
    public void delete(long id) {
        figuraService.delete(id);
    }

}
