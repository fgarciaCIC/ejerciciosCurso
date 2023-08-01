package es.cic.pruebaWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index.html"; // Esto devuelve el nombre de la vista (index.html).
    }
}
