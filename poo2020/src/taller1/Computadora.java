package taller1;

public class Computadora {
    private String color;
    private String marca;
    private String procesador;
    private double velocidad_Procesador;
    private double peso;

    // Metodos para obtener valores

    /**
     * Metodo para obtener el valor de la variable color
     *
     * @return color
     */
    public String obtenerColor() {
        return color;
    }
    /**
     * Metodo para obtener el valor de la variable marca
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
     * Metodo para obtener el valor de la variable velocidad_Procesador
     *
     * @return velocidad_Procesador
     */
    public double obtenerVelocidad_Procesador() {
        return velocidad_Procesador;
    }
    /**
     * Metodo para obtener el valor de la variable peso
     *
     * @return peso
     */
    public double obtenerPeso() {
        return peso;
    }

    // Metodos para actualizar valores

    /**
     * Metodo para actualizar el valor de la variable color
     *
     * @param color
     */
    public void actualizarColor(String color){
        this.color = color;
    }
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
     * Metodo para actualizar el valor de la variable velocidad_Procesador
     *
     * @param velocidad_Procesador
     */
    public void actualizarVelocidad_Procesador(double velocidad_Procesador){
        this.velocidad_Procesador = velocidad_Procesador;
    }
    /**
     * Metodo para actualizar el valor de la variable peso
     *
     * @param peso
     */
    public void actualizarPeso(double peso){
        this.peso = peso;
    }
}
