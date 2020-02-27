package herencia;

public class Administrativo extends Persona {

    /**
     * Constructor para la clase administrativo
     * @param dependencia
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nacimiento
     */
    public Administrativo(String dependencia, String nombre, String identificacion, String estado_civil, String fecha_nacimiento) {
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    // Atributos propios de la clase
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar_procesos(){
        System.out.println("Método para gestionar procesos");
    }
}
