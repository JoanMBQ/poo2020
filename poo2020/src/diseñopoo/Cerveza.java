package diseñopoo;

public class Cerveza {
    private double precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;

    public Cerveza(double precio, int unidades_vendidas, String nombre, String tipo) {
        this.setPrecio(precio);
        this.setUnidades_vendidas(unidades_vendidas);
        this.setNombre(nombre);
        this.setTipo(tipo);
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double calcularVentas(){
       double total = precio * unidades_vendidas;
       return total;
    }
    public String presentar(){
        String cadena = String.format("Cerveza: %s \nTipo: %s \nPrecio: %2f \nUnidades vendidas: %d \nTotal Ventas: %2f"
                , nombre, tipo, precio, unidades_vendidas, calcularVentas());
    return cadena;
    }
}
