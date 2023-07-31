package es.cic.ejerc006;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

//import es.cic.ejerc006.PeliculaController;
//import es.cic.ejerc006.PeliculaService;

//@WebMvcTest({PeliculaController.class, PeliculaService.class})
@SpringBootTest
public class PeliculaControllerIntegrationTest {
    
    @Autowired
    private MockMvc mockMvc;
    

    @Mock
    private PeliculaService peliculaService;
    
    @InjectMocks
    private PeliculaController peliculaController;
    
    @InjectMocks
    private AlmacenDatos almacenDatos;

    @Test
    public void testCrearPelicula() {
        
    
        Pelicula pelicula = new Pelicula();
        pelicula.setId(8L);
        pelicula.setTitulo("Avengers Endgame");
        pelicula.setGenero("Accion");
        pelicula.setDuracion(180L);
        pelicula.setReparto("Robert Downey Jr");

   
        Pelicula peliculaCreada = peliculaController.crearPelicula(pelicula);

     
        //assertNotNull(peliculaCreada);
      assertEquals(1L, peliculaCreada.getId().longValue());
       // assertEquals("Avengers: Endgame", peliculaCreada.getTitulo());
       // assertEquals("Acción", peliculaCreada.getGenero());
       // assertEquals(180, peliculaCreada.getDuracion());
       // assertEquals("Robert Downey Jr., Chris Evans, Scarlett Johansson", peliculaCreada.getReparto());
    }
    

}