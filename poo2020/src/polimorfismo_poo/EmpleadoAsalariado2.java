package polimorfismo_poo;

public class EmpleadoAsalariado2  extends Empleado12{
    private double salario_men;

    public EmpleadoAsalariado2(double salario_men) {
        this.salario_men = salario_men;
    }

    /**
     * Implementación del metodo abstracto que
     * fue definida en la clase padre
     */

    public void calcularSueldoQuincena() {
        sueldo = salario_men/2;
    }
}