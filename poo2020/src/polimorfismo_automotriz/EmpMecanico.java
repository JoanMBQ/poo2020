package polimorfismo_automotriz;

public class EmpMecanico extends Empleados{

    private int trabajos;
    private double quincena;
    private double valorTrabajo;

    public EmpMecanico(double valorTrabajo, int trabajos, String nombre, String RFC, String departamento, String puesto) {
        this.valorTrabajo = valorTrabajo;
        this.trabajos = trabajos;
        this.setNombre(nombre);
        this.setRFC(RFC);
        this.setDepartamento(departamento);
        this.setPuesto(puesto);
    }

    @Override
    public void calcularQuincena() {
        quincena = (trabajos * valorTrabajo) * 0.04;
    }
}
