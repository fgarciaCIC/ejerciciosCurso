package es.cic.ejerc006;

import javax.persistence.Entity;

@Entity
public class Sala {
	 private Long id;
	    private String nombreSala;
	    private int aforo;

	    // Constructor, si lo deseas

	    // Getter y Setter para id
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    // Getter y Setter para nombre
	    public String getNombreSala() {
	        return nombreSala;
	    }

	    public void setNombreSala(String nombreSala) {
	        this.nombreSala= nombreSala;
	    }

	    // Getter y Setter para aforo
	    public int getAforo() {
	        return aforo;
	    }

	    public void setAforo(int aforo) {
	        this.aforo = aforo;
	    }

}
