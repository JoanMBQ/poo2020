package taller1;

public class Estudiante {
    private String nombre;
    private String direccion;
    private String ciclo;
    private int edad;
    private double promedio;

    // Metodos para obtener valores

    /**
     * Metodo para obtener el valor de la variable nombre
     *
     * @return nombre
     */
    public String obtenerNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener el valor de la variable direccion
     *
     * @return direccion
     */
    public String obtenerDireccion() {
        return direccion;
    }
    /**
     * Metodo para obtener el valor de la variable ciclo
     *
     * @return ciclo
     */
    public String obtenerCiclo() {
        return ciclo;
    }
    /**
     * Metodo para obtener el valor de la variable edad
     *
     * @return edad
     */
    public int obtenerEdad() {
        return edad;
    }
    /**
     * Metodo para obtener el valor de la variable promedio
     *
     * @return promedio
     */
    public double obtenerPromedio() {
        return promedio;
    }

    // Metodos para actualizar valores

    /**
     * Metodo para actualizar el valor de la variable nombre
     *
     * @param nombre
     */
    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo para actualizar el valor de la variable direccion
     *
     * @param direccion
     */
    public void actualizarDireccion(String direccion){
        this.direccion = direccion;
    }
    /**
     * Metodo para actualizar el valor de la variable ciclo
     *
     * @param ciclo
     */
    public void actualizarCiclo(String ciclo){
        this.ciclo = ciclo;
    }
    /**
     * Metodo para actualizar el valor de la variable edad
     *
     * @param edad
     */
    public void actualizarEdad(int edad){
        this.edad = edad;
    }
    /**
     * Metodo para actualizar el valor de la variable promedio
     *
     * @param promedio
     */
    public void actualizarPromedio(double promedio){
        this.promedio = promedio;
    }

    /**
     * Metodo para obtener el valor de la variable nombre
     *
     * @return nombre
     */
    public String obtenerEstudiante() {
        String cadena = String.format("Nombre: %s \nDirección: %s \nCiclo: %s \nEdad: %d \nPromedio: %2f",
                nombre, direccion, ciclo, edad, promedio);
        return cadena;
    }
}