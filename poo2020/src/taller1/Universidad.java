package taller1;

public class Universidad {
    private String tipo;
    private String estudiantes;
    private String docentes;
    private String carrera;
    private String departamentos;

    // Metodos para obtener valores

    /**
     * Metodo para actualizar el valor de la variable tipo
     *
     * @return tipo
     */
    public String obtenerTipo() {
        return tipo;
    }
    /**
     * Metodo para obtener el valor de la variable estudiantes
     *
     * @return estudiantes
     */
    public String obtenerEstudiantes() {
        return estudiantes;
    }
    /**
     * Metodo para obtener el valor de la variable docentes
     *
     * @return docentes
     */
    public String obtenerDocentes() {
        return docentes;
    }
    /**
     * Metodo para obtener el valor de la variable administrativos
     *
     * @return administrativos
     */
    public String obtenerCarrera() {
        return carrera;
    }
    /**
     * Metodo para obtener el valor de la variable departamentos
     *
     * @return departamentos
     */
    public String obtenerDepartamentos() {
        return departamentos;
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
     * Metodo para actualizar el valor de la variable estudiantes
     *
     * @param estudiantes
     */
    public void actualizaEstudiantes(String estudiantes){
        this.estudiantes = estudiantes;
    }
    /**
     * Metodo para actualizar el valor de la variable docentes
     *
     * @param docentes
     */
    public void actualizarDocente(String docentes){
        this.docentes = docentes;
    }
    /**
     * Metodo para actualizar el valor de la variable carrera
     *
     * @param carrera
     */
    public void actualizarCarrera(String carrera){
        this.carrera = carrera;
    }
    /**
     * Metodo para actualizar el valor de la variable departamentos
     *
     * @param departamentos
     */
    public void actualizarDepartamentos(String departamentos){
        this.departamentos = departamentos;
    }

    public String obtenerUniversidad() {
        String cadena = String.format("Tipo: %s \nEstudiante: %s \nDocente: %s \nCarrera: %s \nDepartamento: %s",
                tipo, estudiantes, docentes, carrera, departamentos);
        return cadena;
    }
}