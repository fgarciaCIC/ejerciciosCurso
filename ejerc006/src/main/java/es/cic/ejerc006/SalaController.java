package es.cic.ejerc006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

		
@RestController
@RequestMapping("/sala")
public class SalaController {
		
		@Autowired
		private SalaService salaService;

		public SalaController() {
			// TODO Auto-generated constructor stub
		}

		@GetMapping
		public Sala get() {
			Sala sala = new Sala();		
	
			return sala;
		}

}
