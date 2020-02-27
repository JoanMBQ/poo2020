package herencia;

public class Docente extends Persona {

    /**
     * Constructor para la clase docente
     * @param area
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nacimiento
     */
    public Docente(String area, String nombre, String identificacion, String estado_civil, String fecha_nacimiento) {
        this.area = area;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    // Atributos propios de la clase
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseniar(){
        System.out.println("Método para enseñar");
    }

    public void calificar(){
        System.out.println("Método para calificar");
    }
}
