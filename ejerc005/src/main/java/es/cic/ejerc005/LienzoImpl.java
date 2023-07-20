package es.cic.ejerc005;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

public class LienzoImpl implements Ilienzo {
	
	final private int limiteX=1000000;
	final private int limiteY=1000000;
	
	 // Propiedad de lista de figuras como ArrayList
	 private List<Figura> figuras;
	    public LienzoImpl() {
	        figuras = new ArrayList<>();
	    }
	    
        // agregar una figura a la lista
	    @Override
		public void agregarFigura(Figura figura) {
	        figuras.add(figura);
	    }
    	
	    // actualizar figura de la lista  
	    @Override
		public void actualizarFigura(int indiceFigura, Figura figuraActualizada) throws TipoFiguraDesconocidoException {
	        if (indiceFigura >= 0 && indiceFigura < figuras.size()) {
	             // excepcion de indice no valido
	        	
	        	if (figuraActualizada.getPosicionX()>limiteX || figuraActualizada.getPosicionX()<0 || figuraActualizada.getPosicionY()>limiteY || figuraActualizada.getPosicionY()<0)
	        	// Excepcion de limite no valido
	            { throw new TipoFiguraDesconocidoException("Limite no valido: "+ figuraActualizada.getPosicionX());
	        	}
	            else {	            	
	            	figuras.set(indiceFigura, figuraActualizada);	
	            	}            
	            
	        }
	    }
	    
	    // borrar figura de la lista
	    @Override
		public void borrarFigura(int indiceFigura) throws TipoFiguraDesconocidoException {
	        if (indiceFigura >= 0 && indiceFigura < figuras.size()) {	        	
	            figuras.remove(indiceFigura);
	        }
	        else {
	        	// excepcion de indice no valido
	         	throw new TipoFiguraDesconocidoException("Indice de figura desconocido: "+ indiceFigura);
	   		} 
	        	 
	        
	    }
	    
        // retorna la lista de figuras
	    @Override
		public List<Figura> getFiguras() {
	        return figuras;
	    }
	    
	    // Método para abrir fichero CSV la lista de figuras
	    // Con control de Transversalidad al buscar ruta
	    @Override
		public void cargarFigurasDesdeArchivo(String rutaArchivo) throws IOException, TipoFiguraDesconocidoException {
	        // Limpiar el lienzo antes de cargar las nuevas figuras
	        figuras.clear();
	        
	        // Control de Transversaliad de la ruta
	        String nombreFicheroLimpio = FilenameUtils.normalize(rutaArchivo);	    		
    		if (nombreFicheroLimpio == null) {
    			throw new TransversalAttackException("Me han tratado de abrir un fichero sin permisos", rutaArchivo);
    		}        
	        

	        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
	        	
	        	String linea;
	            while ((linea = reader.readLine()) != null) {
	                String[] elementos = linea.split(",");
	                if (elementos.length == 5) {
	                    String tipo = elementos[0].trim();
	                    int posX = Integer.parseInt(elementos[1].trim());
	                    int posY = Integer.parseInt(elementos[2].trim());
	                    String color = elementos[3].trim();
	                    int longitud = Integer.parseInt(elementos[4].trim());

	                    if (tipo.equals("Circulo")) {
	                        Circulo circulo = new Circulo(tipo, posX, posY, color, longitud);
	                        figuras.add(circulo);
	                    } else if (tipo.equals("Cuadrado")) {
	                        Cuadrado cuadrado = new Cuadrado(tipo, posX, posY, color, longitud);
	                        figuras.add(cuadrado);
	                    } else if (tipo.equals("Linea")) {
	                        int finX = Integer.parseInt(elementos[3].trim());
	                        int finY = Integer.parseInt(elementos[4].trim());
	                        Linea nlinea = new Linea(tipo, posX, posY, color, finX, finY);
	                        figuras.add(nlinea);
	                    } else {
	                        // Tipo de figura desconocido
	                    	throw new TipoFiguraDesconocidoException("Tipo de figura desconocido: " + tipo);
	                    }
	                } else {
	                    // Línea de archivo inválida
	                    // excepcion de estructura fichero no valida
	                	throw new TipoFiguraDesconocidoException("Error en estructura: " + elementos.length );
	       	         
	                }
	           
	            }	       
	            
	        } catch (IOException e) {
	            // Lanzar una TransversalAttackException con la causa (IOException) y un mensaje
	            throw new TransversalAttackException("Error al cargar las figuras desde el archivo.", rutaArchivo, e);
	        }    
	        	    
	    }
	    // Método para guardar en archivo CSV la lista de figuras
	    @Override
		public void guardarEnArchivoCSV(String nombreArchivo) throws IOException {
	        try (FileWriter writer = new FileWriter(nombreArchivo)) {
	            for (Figura figura : figuras) {
	                String linea = figura.getTipo() + ";" +
	                		       figura.getPosicionX() + ";" +
	                               figura.getPosicionY() + ";" +
	                               figura.getColor() + ";" +
	                               figura.getLongitud();
	                writer.write(linea);
	                writer.write("\n");
	            }
	        }
	    }
	    
	    // Método mover figura. 
	    // Es la misma formula para todos, es decir, cambiar posicion
	    @Override
		public void moverFigura(int indiceFigura, int nuevaPosX, int nuevaPosY) {
	        Figura figura = figuras.get(indiceFigura);
	        // Al ser realizarse de igual manera el metod mover en todas los tipos de figuras solo hay una funcion
	        figura.setPosicionX(nuevaPosX);
	        figura.setPosicionY(nuevaPosY);
	        figuras.set(indiceFigura, figura); 	        
	    }
	    
	    // Método transformar figura que al contrario que en mover depende del tipo de figura
	    @Override
		public void transformarFigura(int indiceFigura, int incremento) {
	        Figura figura = figuras.get(indiceFigura);
	        switch (figura.getTipo()) {
	            case "Circulo":
	                Circulo circulo = (Circulo) figura;
	                circulo.setRadio(circulo.getRadio() + incremento);
	                figuras.set(indiceFigura, circulo);
	                break;
	            case "Cuadrado":
	                Cuadrado cuadrado = (Cuadrado) figura;
	                cuadrado.setLado(cuadrado.getLado() + incremento);
	                figuras.set(indiceFigura, cuadrado);
	                break;
	            case "Linea":
	                Linea linea = (Linea) figura;
	                int deltaX = linea.getCoordenadaFinalX() - linea.getPosicionX();
	                int deltaY = linea.getCoordenadaFinalY() - linea.getPosicionY();
	                double anguloRad = Math.atan2(deltaY, deltaX);
	                int nuevoDeltaX = (int) (incremento * Math.cos(anguloRad));
	                int nuevoDeltaY = (int) (incremento * Math.sin(anguloRad));
	                linea.setCoordenadaFinalX(linea.getCoordenadaFinalX() + nuevoDeltaX);
	                linea.setCoordenadaFinalY(linea.getCoordenadaFinalY() + nuevoDeltaY);
	                figuras.set(indiceFigura, linea);
	                break;
	            // Agregar más casos para otros tipos de figuras, si es necesario
	            default:
	                // Manejar el caso por defecto, que seria punto que no se transforma
	                break;
	        }
	    }

	    
	 // Extras:
		// Método para copiar y pegar en una ubicación diferente una figura
		// (queda abierto para su implementación futura)
	    @Override
		
	    public void CopiaryPegarFigura(int indiceFigura, int nuevaPosX, int nuevaPosY) {
	    	
	    }
			
		// Método para dibujar (queda abierto para su implementación futura)
	    @Override
	    public void Pintar(){
	    	
	    }
}
