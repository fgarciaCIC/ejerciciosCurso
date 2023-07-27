package es.cic.ejerc006;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

		
@RestController
@RequestMapping("/sesion")
public class SesionController {
		
		@Autowired
		private SesionService sesionService;

		public SesionController() {
			// TODO Auto-generated constructor stub
		}

		@GetMapping
		public Sesion get() {
			Sesion sesion = new Sesion();		
	
			return sesion;
		}

}
