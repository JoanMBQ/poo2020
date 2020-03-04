package herencia_automotriz;

public class EmpMecanico extends Empleados{

    private int trabajos;
    private double quincena;
    private double valorTrabajo;

    public EmpMecanico(double valorTrabajo, int trabajos, String nombre, String RFC, String departamento, String puesto) {
        this.valorTrabajo = valorTrabajo;
        this.trabajos = trabajos;
        this.nombre = nombre;
        this.RFC = RFC;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public double calcularQuincenaMecanicos(){
        quincena = (trabajos * valorTrabajo) * 0.04;
        return quincena;
    }
}
