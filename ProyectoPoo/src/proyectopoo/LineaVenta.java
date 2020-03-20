package proyectopoo;

public class LineaVenta {
	private Producto producto;
	private int cantidad;
	
	public LineaVenta(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	public double getSubtotal() {
		return producto.getPrecio() * cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}