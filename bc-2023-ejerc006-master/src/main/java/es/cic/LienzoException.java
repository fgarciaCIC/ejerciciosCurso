package es.cic;

import es.cic.ejerc006.Figura;

public class LienzoException extends RuntimeException {

	private Figura figura;
	
	public LienzoException() {
	}

	public LienzoException(String message, Figura figura) {
		super(message);
		this.figura = figura;
	}

	public LienzoException(String message, Figura figura, Throwable cause) {
		super(message, cause);
		this.figura = figura;
	}
}
