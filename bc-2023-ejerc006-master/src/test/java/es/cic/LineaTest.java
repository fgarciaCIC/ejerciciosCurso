package es.cic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LineaTest {
	private Linea cut;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.cut = new Linea(2, new Posicion(1,1), "AZUL", new Posicion(2,2));
	}

	@Test
	void testCambiarTamano() {
		Posicion nuevaPosicion = new Posicion(2,2);
		cut.cambiarTamano(nuevaPosicion);
		
		assertThat(cut.getPuntoFinal(), is(nuevaPosicion));
	}

}
