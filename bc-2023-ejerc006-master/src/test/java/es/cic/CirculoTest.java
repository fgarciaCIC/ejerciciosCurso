package es.cic;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoTest {

	private Circulo cut;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new Circulo(0, new Posicion(1, 1), "NEGRO", 4);
	}

	@Test
	void testCambiarTamano() {
		cut.cambiarTamano(4.5);
		
		assertThat(cut.getRadio(), is(4.5d));
	}

}
