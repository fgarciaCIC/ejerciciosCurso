package es.cic.ejerc006;

import org.junit.jupiter.api.Test;

//import es.cic.ejerc006.PeliculaController;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LienzoControllerTest {
    
    @Test
    public void testPing() {
        PeliculaController controller = new PeliculaController();
        String result = controller.ping();
        assertEquals("Hola mundo", result);
    }
    
    @Test
    public void testPing2() {
    	PeliculaController controller = new PeliculaController();
        String result = controller.ping2();
        assertEquals("Adios", result);
    }
    
    // Add more tests as needed
    
}
