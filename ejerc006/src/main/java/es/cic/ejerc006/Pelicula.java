package es.cic.ejerc006;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Pelicula {
   
//	@JsonIgnore
    private Long id;
    private String titulo;
    private String genero;
    private Long duracion;
    private String reparto;

    // Constructor, si lo deseas

    // Getter y Setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter y Setter para titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getDuracion() {
		return duracion;
	}

	public void setDuracion(long i) {
		this.duracion = i;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

}
