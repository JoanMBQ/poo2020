package herencia_empleado;

/**
 * Clase que hereda de la clase Empleado.
 * Contendrá todos los atributos y métodos definidos en Empleado.
 */
public class EmpleadoAsalariado extends Empleado {

    // Atributos propios de la clase
    private double valorMensual, sueldo;

     /**
     * Constructor para la clase EmpleadoAsalariado
     * @param valorMensual
     * @param nombre
     * @param cargo
     * @param dependencia
     */
    public EmpleadoAsalariado(double valorMensual, String nombre, String cargo, String dependencia) {
        this.valorMensual = valorMensual;
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }
    public double CalcularSueldoMensual(){
        sueldo = valorMensual;
        return sueldo;
    }
    public String presentar(){
        System.out.println("-------------------------------------");
        String cadena = String.format("Datos de objeto empleado por hora.\nNombre: %s\nCargo: %s\nDependencia: %s" +
                        "\nSueldo: %.2f", nombre, cargo, dependencia, CalcularSueldoMensual());
        return cadena;
    }
}
