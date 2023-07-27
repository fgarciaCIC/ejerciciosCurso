package es.cic.ejerc006;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Pelicula {
    @JsonIgnore
    private Long id;
    private String titulo;

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

}
