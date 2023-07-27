package es.cic;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LienzoIntegrationTest {

    private Lienzo cut;

    @BeforeEach
    void setUp() throws Exception{
        this.cut = new Lienzo();      
    }

    @Test
    void cambiarLinea() {
    	Linea linea = new Linea(0, new Posicion(1, 1), "NEGRO", new Posicion(2,2));

		cut.cambiar(linea, new Posicion(56, 47));
    	
    	assertThat(linea.getPuntoFinal(), is(new Posicion(56, 47)));
    }
    
}
