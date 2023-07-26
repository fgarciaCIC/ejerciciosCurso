package es.cic.ejerc005;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest({LienzoController.class, LienzoService.class})
public class LienzoControllerIntegrationTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void testPing() throws Exception {
        mockMvc.perform(get("/lienzo/ping"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hola mundo"));
    }
    
    @Test
    public void testPing2() throws Exception {
        mockMvc.perform(get("/lienzo/ping2"))
               .andExpect(status().isOk())
               .andExpect(content().string("Adios"));
    }

    @Test
    public void testGet() throws Exception {
        mockMvc.perform(get("/lienzo"))
               .andExpect(status().isOk());
    }
    

}