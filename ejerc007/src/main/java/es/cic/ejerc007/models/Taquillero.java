package es.cic.ejerc007.models;

import javax.persistence.Entity;

//@Entity
public class Taquillero {
    private Long id;
    private String nombre;
    private String apellido;
    

    // Constructor
    public Taquillero() {
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}

