package taller1;

public class Animal {
    private String tipo;
    private String nombre;
    private String especie;
    private String tipo_Reproduccion;
    private double peso;

// Metodos para obtener valores

    /**
     * Metodo para obtener el valor de la variable tipo
     *
     * @return tipo
     */
    public String obtenerTipo() {
        return tipo;
    }
    /**
     * Metodo para actualizar el valor de la variable nombre
     *
     * @return nombre
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el valor de la variable especie
     *
     * @return especie
     */
    public String obtenerEspecie() {
        return especie;
    }
    /**
     * Metodo para obtener el valor de la variable tipo_Reproduccion
     *
     * @return tipo_Reproduccion
     */
    public String obtenerTipo_Reproduccion() {
        return tipo_Reproduccion;
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
     * Metodo para actualizar el valor de la variable tipo
     *
     * @param tipo
     */
    public void actualizarTipo(String tipo){
        this.tipo = tipo;
    }
    /**
     * Metodo para actualizar el valor de la variable nombre
     *
     * @param nombre
     */
    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo para actualizar el valor de la variable especie
     *
     * @param especie
     */
    public void actualizarEspecie(String especie){
        this.especie = especie;
    }
    /**
     * Metodo para actualizar el valor de la variable tipo_Reproduccion
     *
     * @param tipo_Reproduccion
     */
    public void actualizarTipo_Reproduccion(String tipo_Reproduccion){
        this.tipo_Reproduccion = tipo_Reproduccion;
    }
    /**
     * Metodo para actualizar el valor de la variable peso
     *
     * @param peso
     */
    public void actualizarPeso(double peso){
        this.peso = peso;
    }

    public String obtenerAnimal() {
        String cadena = String.format("Tipo: %s \nNombre: %s \nEspecie: %s \nTipo de Reproducción: %s \nPeso: %2f Kg",
                tipo, nombre, especie, tipo_Reproduccion, peso);
        return cadena;
    }
}
