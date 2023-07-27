package es.cic.ejerc006;

import java.time.LocalDateTime;

public class Sesion {
	 private Long id;
	    private LocalDateTime fechahora;
	    private Sala sala;
	    private Pelicula pelicula;

	    // Constructor, si lo deseas

	    // Getter y Setter para id
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    // Getter y Setter para hora
	    public LocalDateTime getFechaHora() {
	        return fechahora;
	    }

	    public void setFechaHora(LocalDateTime fechahora) {
	        this.fechahora = fechahora;
	    }

	    // Getter y Setter para sala
	    public Sala getSala() {
	        return sala;
	    }

	    public void setSala(Sala sala) {
	        this.sala = sala;
	    }

	    // Getter y Setter para pelicula
	    public Pelicula getPelicula() {
	        return pelicula;
	    }

	    public void setPelicula(Pelicula pelicula) {
	        this.pelicula = pelicula;
	    }

}
