package proyectopoo;

import java.util.ArrayList;
import java.util.List;


public class Venta {
	private List<LineaVenta> productosVendidos;
	
	//El precio será una propiedad calculada
	public Venta() {
		this.productosVendidos = new ArrayList<LineaVenta>();
	}
	
	//Evitar aliasing
	public List<LineaVenta> getProductos() {
		return new ArrayList<LineaVenta>(this.productosVendidos);
	}
	
	public void cerrarVenta() {
		for (LineaVenta lv : productosVendidos) {
			int r = lv.getProducto().getCantidad() - lv.getCantidad();
			lv.getProducto().setCantidad(r);
		}
	}
	
	public double getSubTotal() {
		double subtotal = 0;
		for (LineaVenta lv : productosVendidos) {
			subtotal += lv.getSubtotal();
		}
		return subtotal;
	}
	
	public boolean comprobar(String nombre) {
		for (LineaVenta p : productosVendidos)
			if (p.getProducto().getNombre().equals(nombre))
				return true;
		return false;
	}
	
	public void modifyLine(int index, int cantidad_nueva) {
		productosVendidos.get(index).setCantidad(cantidad_nueva);
	}
	
	public void removeLV(int index) {
		productosVendidos.remove(index);
	}
	
	public void rmLV() {
		productosVendidos.clear();
	}
	
	public void addlineaVenta(LineaVenta lv) {
		productosVendidos.add(lv);
	}
	
	public LineaVenta getLV(int index) {
		return productosVendidos.get(index);
	}
	
	
	public double getIva() {
		return getSubTotal() * 0.12;
	}
	
	public double getTotal() {
		return getSubTotal() + getIva();
	}
}
