package es.cic.ejerc006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;

	public PeliculaController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping
	public Pelicula get() {
		Pelicula pelicula = new Pelicula();
		
		//Figura figura1 = new Figura(1, "cuadrado");
	//	figura1.setLienzo(lienzo);
		//lienzo.getFiguras().add(figura1);
		
		//lienzo.getFiguras().add(new Figura(2, "circulo"));
		//lienzo.getFiguras().add(new Figura(3, "triangulo"));
		return pelicula;
	}

	@GetMapping(path="/ping")
	public String ping() {
		this.peliculaService.mover();
		return "Hola mundo";
	}

	@GetMapping(path="/ping2")
	public String ping2() {
		return "Adios";
	}
}
