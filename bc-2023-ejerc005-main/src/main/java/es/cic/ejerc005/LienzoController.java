package es.cic.ejerc005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lienzo")
public class LienzoController {
	
	@Autowired
	private LienzoService lienzoService;

	public LienzoController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping
	public Lienzo get() {
		Lienzo lienzo = new Lienzo();
		
		Figura figura1 = new Figura(1, "cuadrado");
		figura1.setLienzo(lienzo);
		lienzo.getFiguras().add(figura1);
		
		lienzo.getFiguras().add(new Figura(2, "circulo"));
		lienzo.getFiguras().add(new Figura(3, "triangulo"));
		return lienzo;
	}

	@GetMapping(path="/ping")
	public String ping() {
		this.lienzoService.mover();
		return "Hola mundo";
	}

	@GetMapping(path="/ping2")
	public String ping2() {
		return "Adios";
	}
}
