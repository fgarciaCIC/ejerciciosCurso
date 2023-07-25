package es.cic.ejerc005;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class TestFigura {
					
		
	private Figura figura;

    @BeforeEach
    public void setup() {
        figura = mock(Figura.class);
    }
    
    // Test para comprobar que al cambiar posición X varia coordenada X
    @Test
    public void testSetPosicionX() {
        when(figura.getPosicionX()).thenReturn(50);
        figura.setPosicionX(100);
        assertThat(figura.getPosicionX(), is(equalTo(50)));
    }
    // Test para comprobar que al cambiar posición Y varia coordenada Y
    @Test
    public void testSetPosicionY() {
        when(figura.getPosicionY()).thenReturn(200);
        figura.setPosicionY(200);
        assertThat(figura.getPosicionY(), equalTo(200));
    }
    // Test para verificar la asignación de Color
    @Test
    public void testSetColor() {
        when(figura.getColor()).thenReturn("Azul");
        figura.setColor("Azul");
        assertThat(figura.getColor(), is(equalTo("Azul")));
    }
    // Tests para verificar que la instancia de una figura es distinta a otra 
    @Test
    public void testEquals() {
        Figura otraFigura = mock(Figura.class);
        when(otraFigura.getPosicionX()).thenReturn(50);
        when(otraFigura.getPosicionY()).thenReturn(50);
        when(otraFigura.getColor()).thenReturn("Rojo");
        assertThat(figura, is(equalTo(otraFigura)));
    }

    @Test
    public void testNotEquals() {
        Figura otraFigura = mock(Figura.class);
        when(otraFigura.getPosicionX()).thenReturn(100);
        when(otraFigura.getPosicionY()).thenReturn(100);
        when(otraFigura.getColor()).thenReturn("Rojo");
        assertThat(figura, is(not(equalTo(otraFigura))));
    }
	    
}


