package deber_seleccion;

public class Alumno {
    // delcaracion de variables
    private String nombre;
    private double calif1;
    private double calif2;
    private double calif3;
    private double calif4;
    private double promedio;
    private String observacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalif1() {
        return calif1;
    }

    public void setCalif1(double calif1) {
        this.calif1 = calif1;
    }

    public double getCalif2() {
        return calif2;
    }

    public void setCalif2(double calif2) {
        this.calif2 = calif2;
    }

    public double getCalif3() {
        return calif3;
    }

    public void setCalif3(double calif3) {
        this.calif3 = calif3;
    }

    public double getCalif4() {
        return calif4;
    }

    public void setCalif4(double calif4) {
        this.calif4 = calif4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * Metodo constructor para el objeto Estudiante
     * @param nombre
     * @param calif1
     * @param calif2
     * @param calif3
     * @param calif4
     */
    public Alumno(String nombre, double calif1, double calif2, double calif3, double calif4){
        this.setNombre(nombre);
        this.setCalif1(calif1);
        this.setCalif2(calif2);
        this.setCalif3(calif3);
        this.setCalif4(calif4);
    }

    /**
     * Metodo para obtener el promedio del estudiante
     * @return promedio
     */
    public double calcularPromedio(){
        setPromedio((getCalif1() + getCalif2() + getCalif3() + getCalif4())/4);
        return getPromedio();
    }

    /**
     * Metodo para obtener la observacion del estudiante
     * @return observacion
     */
    public String calcularObservacion(){
        if (getPromedio() >= 60){
            setObservacion("Aprobado");
        } else{
            setObservacion("Reprobado");
        }
        return getObservacion();
    }

    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("Nombre: %S\nPromedio: %.2f \nObservacion: %s", getNombre(), calcularPromedio(),
                calcularObservacion());
        return cadena;
    }
}