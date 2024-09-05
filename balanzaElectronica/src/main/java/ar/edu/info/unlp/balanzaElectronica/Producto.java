package ar.edu.info.unlp.balanzaElectronica;

public class Producto {
     private double precioPorKilo;
     private double peso;
     private String descripcion;
     
     public Producto() {
    	 
     }
     
     public Producto( String descripcion,double precioPorKilo, double peso) {
		super();
		this.precioPorKilo = precioPorKilo;
		this.peso = peso;
		this.descripcion = descripcion;
	}

	public double getPrecio() {
    	  return this.precioPorKilo*this.peso;
     }

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
     
     
}
