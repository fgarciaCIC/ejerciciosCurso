package es.cic.ejerc007;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import es.cic.ejerc007.AlmacenDatos;
import es.cic.ejerc007.VentaEntradaService;

public class VentaControllerIntegrationTest {

	    @Mock
	    private AlmacenDatos almacenDatos;

	    @InjectMocks
	    private VentaEntradaService ventaEntradaService;

	    @Test
	    public void testCrearVentaEntrada() {
	/*       
	        VentaEntrada ventaEntrada = new VentaEntrada();
	        ventaEntrada.setId(1L);
	        ventaEntrada.setCantidad(2);
	        ventaEntrada.setPrecioUnitario(10.0);

	        // Mockear el comportamiento del AlmacenDatos para que retorne el mismo objeto
	        when(almacenDatos.crearVentaEntrada(ventaEntrada)).thenReturn(ventaEntrada);
	        
	        VentaEntrada ventaEntradaCreada = ventaEntradaService.crearVentaEntrada(ventaEntrada);

	        assertNotNull(ventaEntradaCreada);
	        assertEquals(1L, ventaEntradaCreada.getId().longValue());
	        assertEquals(2, ventaEntradaCreada.getCantidad());
	        assertEquals(10.0, ventaEntradaCreada.getPrecioUnitario(), 0.001);
	        */
	    }
}
