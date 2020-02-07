package taller1;

public class Celular {
    private String marca;
    private String procesador;
    private int almacenamiento;
    private int ram;
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
    public int obtenerAlmacenamiento() {
        return almacenamiento;
    }
    /**
     * Metodo para obtener el valor de la variable ram
     *
     * @return ram
     */
    public int obtenerRam() {
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
    public void actualizarAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }
    /**
     * Metodo para actualizar el valor de la variable ram
     *
     * @param ram
     */
    public void actualizarRam(int ram){
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

    public String obtenerCelular() {
        String cadena = String.format("Marca: %s \nProcesador: %s \nAlmacenamiento: %d Gb \nRam: %d Gb \nPrecio: $%2f",
                marca, procesador, almacenamiento, ram, precio);
        return cadena;
    }
}