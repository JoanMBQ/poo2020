package herencia_empleado;

/**
 * Clase que hereda de la clase Empleado.
 * Contendrá todos los atributos y métodos definidos en Empleado.
 */
public class EmpleadoPorHora extends Empleado {

    // Atributos propios de la clase
    private int horas;
    private double valorHora;
    private double sueldo;

     /**
     * Constructor para la clase EmpleadoPorHora
     * @param horas
     * @param valorHora
     * @param nombre
     * @param cargo
     * @param dependencia
     */
    public EmpleadoPorHora(int horas, double valorHora, String nombre, String cargo, String dependencia) {
        this.horas = horas;
        this.valorHora = valorHora;
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    public double CalcularSueldoPorHora(){
        sueldo = horas * valorHora;
        return sueldo;
    }
    public String presentar(){
        System.out.println("-------------------------------------");
        String cadena = String.format("Datos de objeto empleado por hora.\nNombre: %s\nCargo: %s\nDependencia: %s" +
                        "\nHoras Trabajadas: %d\nCuota por hora: %.2f\nSueldo: %.2f"
                , nombre, cargo, dependencia, horas, valorHora, CalcularSueldoPorHora());
        return cadena;
    }
}
