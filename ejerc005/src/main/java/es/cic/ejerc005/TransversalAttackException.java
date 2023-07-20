package es.cic.ejerc005;

public class TransversalAttackException extends RuntimeException {
		
	// Creacion de la excpeción personalizada para los ataques transversales
	
	private static final long serialVersionUID = -2315568326662792357L;

	private String ruta;
	
	public TransversalAttackException() {
		super();		
	}

	public TransversalAttackException(String message, String ruta, Throwable cause) {
		super(message, cause);
		this.ruta = ruta;
	}

	public TransversalAttackException(String message, String ruta) {
		super(message);
		this.ruta = ruta;
	}

}
