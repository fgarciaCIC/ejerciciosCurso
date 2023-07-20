package es.cic.ejerc005;

import java.io.IOException;
import java.util.List;

public interface Ilienzo {

	// agregar una figura a la lista
	void agregarFigura(Figura figura);

	// actualizar figura de la lista  
	void actualizarFigura(int indiceFigura, Figura figuraActualizada) throws TipoFiguraDesconocidoException;

	// borrar figura de la lista
	void borrarFigura(int indiceFigura) throws TipoFiguraDesconocidoException;

	// retorna la lista de figuras
	List<Figura> getFiguras();

	// Método para abrir fichero CSV la lista de figuras
	// Con control de Transversalidad al buscar ruta
	void cargarFigurasDesdeArchivo(String rutaArchivo) throws IOException, TipoFiguraDesconocidoException;

	// Método para guardar en archivo CSV la lista de figuras
	void guardarEnArchivoCSV(String nombreArchivo) throws IOException;

	// Método mover figura. 
	// Es la misma formula para todos, es decir, cambiar posicion
	void moverFigura(int indiceFigura, int nuevaPosX, int nuevaPosY);

	// Método transformar figura que al contrario que en mover depende del tipo de figura
	void transformarFigura(int indiceFigura, int incremento);
	
	// Extras:
	// Método para copiar y pegar en una ubicación diferente una figura
	// (queda abierto para su implementación futura)
	void CopiaryPegarFigura(int indiceFigura, int nuevaPosX, int nuevaPosY);
		
	// Método para dibujar (queda abierto para su implementación futura)
	void Pintar();
	
}