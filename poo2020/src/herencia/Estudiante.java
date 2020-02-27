package herencia;

/**
 * Clase que hereda de la clase Persona.
 * Contendrá todos los atributos y métodos definidos en Persona
 */
public class Estudiante extends Persona {

    /**
     * Constructor para la clase estudiante
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nacimiento
     */
    public Estudiante(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nacimiento) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    // Atributos propios de la clase
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void matricuar(){
        System.out.println("Método para matricular");
    }

    public void aprender(){
        System.out.println("Método para aprender");
    }
}
