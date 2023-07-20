package es.cic.ejerc005;

import java.io.BufferedReader;
import java.io.IOException;

public interface Ifichero {
    BufferedReader abrirFichero(String nombreFichero) throws TransversalAttackException, IOException;
}
