package proyectopoo;

import java.util.ArrayList;
import java.util.List;

public class TPV {
	private List<Venta> ventas;
	private List<Producto> productos;
	
	
	public TPV() {
		this.ventas = new ArrayList<Venta>();
		this.productos = new ArrayList<Producto>();
	}
	
	public List<Producto> findProductos(String nombre){
		if (nombre == null)
			return null;
		
		ArrayList<Producto> ret = new ArrayList<Producto>();
		for (Producto p : productos) {
			if (p.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
				ret.add(p);
			}
		}
		return ret;
	}
	
	public LineaVenta hayStock(String nombre, int cantidad) {
		for (Producto p : productos) {
			if (p.getNombre().equals(nombre)) {
				if (p.getCantidad()>= cantidad)
					return new LineaVenta(p, cantidad);
				else return null;
			}
		}
		return null;
	}
	
	public List<LineaVenta> comprobarVenta(List<String> nombres, List<Integer> cantidades, int nproductos) {
		ArrayList<LineaVenta> lvs = new ArrayList<LineaVenta>();
		for (int i = 0; i < nproductos; i++) {
			LineaVenta lv = hayStock(nombres.get(i), cantidades.get(i));
			if (lv == null)
				return null;
			else 
				lvs.add(lv);
		}
		return lvs;
	}
	
	public void cerrarVenta(Venta v) {
		v.cerrarVenta();
		for (Producto p : productos) {
			if (!p.hayStock()) {
				productos.remove(p);
			}
		}
	}
	
	public void addVenta(Venta v) {
		ventas.add(v);
	}
	
	public void removeProducto(String nombre) {
		for (Producto p : productos)
			if (p.getNombre().equals(nombre)) {
				productos.remove(p);
				return;
			}
	}
	
	/**
	 * 
	 * @param nombre
	 * @param cantidad
	 * @param precio
	 * @return  -1 Si el nombre es null
	 * 			-2 Si la cantidad es <= 0
	 * 			-3 Si el precio es <= 0.0
	 * 			 1 Si el producto se actualizó
	 * 			 0 Si el registro se ha hecho correctamente
	 */
	public int registrarProducto(String nombre, int cantidad, double precio) {
		if (nombre == null)
			return -1;
		if (cantidad <= 0)
			return -2;
		if (precio <= 0.0)
			return -3;
		for (Producto p : productos)
			if (p.getNombre().equals(nombre)) {
				p.setCantidad(cantidad);
				p.setPrecio(precio);
				return 1;
			}
		
		productos.add(new Producto(nombre, cantidad, precio));
		return 0;
	}
		
		
}
