package es.cic.ejerc006;

public class VentaEntrada {
	  private Long id;
	    private int cantidad;
	    private double precioUnitario;
	    private double descuento;	    
	    private double totalVenta;	 
		private Sesion sesion;
		
	   
	    
	    // Getter y Setter para id
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    // Getter y Setter para cantidad
	    public int getCantidad() {
	        return cantidad;
	    }

	    public void setCantidad(int cantidad) {
	        this.cantidad = cantidad;
	    }

	    // Getter y Setter para sesion
	    public Sesion getSesion() {
	        return sesion;
	    }

	    public void setSesion(Sesion sesion) {
	        this.sesion = sesion;
	    }
	    
	    // Getter y setter de las otras propiedades
	    
	    public double getPrecioUnitario() {
			return precioUnitario;
		}

		public void setPrecioUnitario(double precioUnitario) {
			this.precioUnitario = precioUnitario;
		}

		public double getDescuento() {
			return descuento;
		}

		public void setDescuento(double descuento) {
			this.descuento = descuento;
		}

		public double getTotalVenta() {
			return totalVenta;
		}

		public void setTotalVenta(double totalVenta) {
			this.totalVenta = totalVenta;
		}

}
