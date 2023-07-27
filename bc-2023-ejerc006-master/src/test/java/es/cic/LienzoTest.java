package es.cic;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LienzoTest {

    private Lienzo cut;

    @BeforeEach
    void setUp() throws Exception{
        this.cut = new Lienzo();      
    }

    @Test
    void testPintar() {
		Circulo circulo = new Circulo(0, new Posicion(1, 1), "NEGRO", 4);

		cut.pintar(circulo);
		
		assertThat(cut.getFiguras().contains(circulo), is(true));		
    }
    
    @Test
    void cambiar() {
    	Linea figura = mock(Linea.class);

		cut.cambiar(figura, new Posicion(56, 47));
    	
    	verify(figura, times(1)).cambiarTamano(new Posicion(56, 47));
    }
    
}
