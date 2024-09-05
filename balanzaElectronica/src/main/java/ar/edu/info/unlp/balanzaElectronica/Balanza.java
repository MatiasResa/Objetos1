package ar.edu.info.unlp.balanzaElectronica;

import java.util.ArrayList;
import java.util.List;

/*
 *Mejorar la balanza para que recuerde los productos ingresados (los mantenga
 * en una colección). Analice de qué forma puede realizarse este nuevo 
 * requerimiento e implemente el mensaje 
getProductos() : List<Producto>
que retorna todos los productos ingresados a la balanza (en la compra actual,
 es decir, desde la última vez que se la puso a cero).

¿Qué cambio produce este nuevo requerimiento en el mensaje ponerEnCero() ?

¿Es necesario, ahora, almacenar los totales en la balanza? ¿Se pueden obtener
 estos valores de otra forma?

 */
public class Balanza {
   private List<Producto> productos;
   private int cantidadDeProductos;
   private double precioTotal;
   private double pesoTotal;

   public Balanza() {
      productos=new ArrayList<Producto>();


    }
   public void ponerEnCero() {
	   productos=new ArrayList<Producto>();
    }

   public void agregarProducto(Producto producto) {
	  this.productos.add(producto);

     }
	
   public Ticket emitirTicket() {
		return new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
	}
	
	public double getPrecioTotal() {
		return productos.stream()
				.mapToDouble(producto -> producto.getPrecio())
				.sum();
	}
	public double getPesoTotal() {
		return productos.stream()
				.mapToDouble(producto -> producto.getPeso())
				.sum();
	}
	public int getCantidadDeProductos() {
		return (int) productos.stream().count();
	}
	
	
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	 public static void main(String[] args) {
	        Balanza balanza = new Balanza();
	        Producto producto1 = new Producto("Manzana", 1.2, 3.5);
	        Producto producto2 = new Producto("Leche", 2.0, 4.0);

	        balanza.agregarProducto(producto1);
	        balanza.agregarProducto(producto2);
	        }
	
}
