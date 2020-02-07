package taller1;

public class Vehiculo {
    private String marca;
    private String origen;
    private double peso;
    private double precio;
    private double capacidad_combustible;

    // Metodos para obtener valores

    /**
     * Metodo para actualizar el valor de la variable marca
     *
     * @return marca
     */
    public String obtenerMarca() {
        return marca;
    }
    /**
     * Metodo para obtener el valor de la variable origen
     *
     * @return origen
     */
    public String obtenerOrigen() {
        return origen;
    }
    /**
     * Metodo para obtener el valor de la variable peso
     *
     * @return peso
     */
    public double obtenerPeso() {
        return peso;
    }
    /**
     * Metodo para obtener el valor de la variable precio
     *
     * @return precio
     */
    public double obtenerPrecio() {
        return precio;
    }
    /**
     * Metodo para obtener el valor de la variable capacidad_combustible
     *
     * @return capacidad_combustible
     */
    public double obtenerCapacidad_Combustible() {
        return capacidad_combustible;
    }

    // Metodos para actualizar valores

    /**
     * Metodo para actualizar el valor de la variable marca
     *
     * @param marca
     */
    public void actualizarMarca(String marca){
        this.marca = marca;
    }
    /**
     * Metodo para actualizar el valor de la variable origen
     *
     * @param origen
     */
    public void actualizarOrigen(String origen){
        this.origen = origen;
    }
    /**
     * Metodo para actualizar el valor de la variable peso
     *
     * @param peso
     */
    public void actualizarPeso(double peso){
        this.peso = peso;
    }
    /**
     * Metodo para actualizar el valor de la variable precio
     *
     * @param precio
     */
    public void actualizarPrecio(double precio){
        this.precio = precio;
    }
    /**
     * Metodo para actualizar el valor de la variable capacidad_combustible
     *
     * @param capacidad_combustible
     */
    public void actualizarCapacidad_Combustible(double capacidad_combustible){
        this.capacidad_combustible = capacidad_combustible;
    }

    public String obtenerVehiculo() {
        String cadena = String.format("Marca: %s \nOrigen: %s \nPeso: %s Kg \nPrecio: $%2f \nCapacidad de Combustible: %2f Lt",
                marca, origen, peso, precio, capacidad_combustible);
        return cadena;
    }
}