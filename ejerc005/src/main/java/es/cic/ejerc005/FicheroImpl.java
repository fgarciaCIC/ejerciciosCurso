package es.cic.ejerc005;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;

public class FicheroImpl implements Ifichero {

	// Implementación de intefaz de fichero 
	// para el tema de la Seguridad de la Transversalidad
	
    @Override
	public BufferedReader abrirFichero(String nombreFichero) throws IOException {
		String nombreFicheroLimpio = FilenameUtils.normalize(nombreFichero);
		
		if (nombreFicheroLimpio == null) {
			throw new TransversalAttackException("Me han tratado de abrir un fichero sin permisos", nombreFichero);
		}
		
		String separador = "" + File.separatorChar;

					
		Path p = Paths.get("src",
							separador,
							"test",
							separador,
							"resources", 
							separador,
							"ficherosAccesibles",
							separador,
							nombreFicheroLimpio).normalize();
		
		return Files.newBufferedReader(p);

    }	
    
}