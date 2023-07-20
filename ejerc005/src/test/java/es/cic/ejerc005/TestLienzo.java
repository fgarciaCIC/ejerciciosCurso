package es.cic.ejerc005;

import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.mock;

public class TestLienzo {
	

    private LienzoImpl lienzo;
    private Figura figuraMock;

    @BeforeEach
    public void setup() {
        lienzo = new LienzoImpl();
        figuraMock = mock(Figura.class);
    }
    
    // Test para verificar que se agrega una figura al lienzo
    @Test
    public void testAgregarFigura() {
        lienzo.agregarFigura(figuraMock);

        List<Figura> figuras = lienzo.getFiguras();
        assertThat(figuras, contains(figuraMock));
    }
    // Test para verificar que al actualizar una figura la lista la contiene
    @Test
    public void testActualizarFigura_ValidIndex() throws TipoFiguraDesconocidoException {
        Figura figuraActualizadaMock = mock(Figura.class);

        lienzo.agregarFigura(figuraMock);
        lienzo.actualizarFigura(0, figuraActualizadaMock);

        List<Figura> figuras = lienzo.getFiguras();
        assertThat(figuras, contains(figuraActualizadaMock));
    }
    // Test para comprobar que si se agrega y luego actualiza una figura luego no es la misma
    @Test
    public void testActualizarFigura_InvalidIndex() {
        Figura figuraActualizadaMock = mock(Figura.class);

        lienzo.agregarFigura(figuraMock);
        assertThrows(IndexOutOfBoundsException.class, () -> lienzo.actualizarFigura(1, figuraActualizadaMock));

        List<Figura> figuras = lienzo.getFiguras();
        assertThat(figuras, contains(figuraMock));
    }
    // Test para comprobar invalida posicion
    @Test
    public void testActualizarFigura_InvalidPosition() {
        Figura figuraActualizadaMock = mock(Figura.class);

        lienzo.agregarFigura(figuraMock);
        when(figuraActualizadaMock.getPosicionX()).thenReturn(2000000); // Valor inválido

        assertThrows(IllegalArgumentException.class, () -> lienzo.actualizarFigura(0, figuraActualizadaMock));

        List<Figura> figuras = lienzo.getFiguras();
        assertThat(figuras, contains(figuraMock));
    } 
    // Test para comprobar que borra figuras y deja vacia la lista
    @Test
    public void testBorrarFigura_ValidIndex() throws TipoFiguraDesconocidoException {
        lienzo.agregarFigura(figuraMock);
        lienzo.borrarFigura(0);

        List<Figura> figuras = lienzo.getFiguras();
        assertThat(figuras, is(empty()));
    }
    // Test para verificar que si se agrega y borra figura luego no la contiene
    @Test
    public void testBorrarFigura_InvalidIndex() {
        lienzo.agregarFigura(figuraMock);
        assertThrows(IndexOutOfBoundsException.class, () -> lienzo.borrarFigura(1));

        List<Figura> figuras = lienzo.getFiguras();
        assertThat(figuras, contains(figuraMock));
    }
    // Test para comprobar que mueve figura
    @Test
    public void testMoverFigura() {
        int nuevaPosX = 300;
        int nuevaPosY = 300;

        lienzo.agregarFigura(figuraMock);
        lienzo.moverFigura(0, nuevaPosX, nuevaPosY);

        verify(figuraMock).setPosicionX(nuevaPosX);
        verify(figuraMock).setPosicionY(nuevaPosY);
    }

  	   
}
