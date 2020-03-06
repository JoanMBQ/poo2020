package datos_tipo_objeto;

public class Estudiante {
    private String nombre;
    private String cedula;
    private int edad;
    private String carrera;
    private String correo;

    public Estudiante(){

    }

    public Estudiante(String nombre, String cedula, int edad, String carrera, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.carrera = carrera;
        this.correo = correo;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
