package taller1;

public class Docente {
    private String nombre;
    private String correo;
    private String titulo;
    private String area_Trabajo;
    private int edad;

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
     * Metodo para obtener el valor de la variable correo
     *
     * @return correo
     */
    public String obtenerCorreo() {
        return correo;
    }
    /**
     * Metodo para obtener el valor de la variable titulo
     *
     * @return titulo
     */
    public String obtenerTitulo() {
        return titulo;
    }
    /**
     * Metodo para obtener el valor de la variable area_Trabajo
     *
     * @return area_Trabajo
     */
    public String obtenerArea_Trabajo() {
        return area_Trabajo;
    }
    /**
     * Metodo para obtener el valor de la variable edad
     *
     * @return edad
     */
    public int obtenerEdad() {
        return edad;
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
     * Metodo para actualizar el valor de la variable correo
     *
     * @param correo
     */
    public void actualizaCorreo(String correo){
        this.correo = correo;
    }
    /**
     * Metodo para actualizar el valor de la variable titulo
     *
     * @param titulo
     */
    public void actualizarTitulo(String titulo){
        this.titulo = titulo;
    }
    /**
     * Metodo para actualizar el valor de la variable area_Trabajo
     *
     * @param area_Trabajo
     */
    public void actualizarArea_Trabajo(String area_Trabajo){
        this.area_Trabajo = area_Trabajo;
    }
    /**
     * Metodo para actualizar el valor de la variable edad
     *
     * @param edad
     */
    public void actualizarEdad(int edad){
        this.edad = edad;
    }

    public String obtenerDocente() {
        String cadena = String.format("Nombre: %s \nCorreo: %s \nTitulo: %s \narea_Trabajo: %s \nEdad: %d",
                nombre, correo, titulo, area_Trabajo, edad);
        return cadena;
    }
}