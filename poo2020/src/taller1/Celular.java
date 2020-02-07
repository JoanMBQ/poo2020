package taller1;

public class Celular {
    private String marca;
    private String procesador;
    private double almacenamiento;
    private double ram;
    private double precio;

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
     * Metodo para obtener el valor de la variable procesador
     *
     * @return procesador
     */
    public String obtenerProcesador() {
        return procesador;
    }
    /**
     * Metodo para obtener el valor de la variable almacenamiento
     *
     * @return almacenamiento
     */
    public double obtenerAlmacenamiento() {
        return almacenamiento;
    }
    /**
     * Metodo para obtener el valor de la variable ram
     *
     * @return ram
     */
    public double obtenerRam() {
        return ram;
    }
    /**
     * Metodo para obtener el valor de la variable precio
     *
     * @return precio
     */
    public double obtenerPrecio() {
        return precio;
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
     * Metodo para actualizar el valor de la variable procesador
     *
     * @param procesador
     */
    public void actualizarProcesador(String procesador){
        this.procesador = procesador;
    }
    /**
     * Metodo para actualizar el valor de la variable almacenamiento
     *
     * @param almacenamiento
     */
    public void actualizarAlmacenamiento(double almacenamiento){
        this.almacenamiento = almacenamiento;
    }
    /**
     * Metodo para actualizar el valor de la variable ram
     *
     * @param ram
     */
    public void actualizarRam(double ram){
        this.ram = ram;
    }
    /**
     * Metodo para actualizar el valor de la variable precio
     *
     * @param precio
     */
    public void actualizarPrecio(double precio){
        this.precio = precio;
    }
}
