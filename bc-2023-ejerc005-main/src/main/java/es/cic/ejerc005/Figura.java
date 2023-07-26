package es.cic.ejerc005;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Figura {
    @JsonIgnore
    private Lienzo lienzo;

    private long id;
    private String tipo;

    public Figura() {
        super();
    }

    public Figura(long id, String tipo) {
        super();
        this.id = id;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Lienzo getLienzo() {
        return lienzo;
    }

    public void setLienzo(Lienzo lienzo) {
        this.lienzo = lienzo;
    }
}
