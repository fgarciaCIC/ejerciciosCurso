package es.cic.ejerc006;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Sesion {
	 private Long id;
	    private LocalDateTime fechaHora;
	    
	    @ManyToOne
	    @JoinColumn(name = "pelicula_id", referencedColumnName = "id") 
	    private Pelicula pelicula;
	    @ManyToOne
	    @JoinColumn(name = "sala_id", referencedColumnName = "id")
	    private Sala sala;

	   

	    // Getter y Setter para id
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    // Getter y Setter para hora
	    public LocalDateTime getFechaHora() {
	        return fechaHora;
	    }

	    public void setFechaHora(LocalDateTime fechaHora) {
	        this.fechaHora = fechaHora;
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

	    public void setPelicula(Pelicula peliculaId) {
	        this.pelicula = pelicula;
	    }

}
