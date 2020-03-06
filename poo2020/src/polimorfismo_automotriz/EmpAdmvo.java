package polimorfismo_automotriz;

public class EmpAdmvo extends Empleados{

    private double mensual;

    public EmpAdmvo(double mensual, String nombre, String RFC, String departamento, String puesto) {
        this.mensual = mensual;
        this.setNombre(nombre);
        this.setRFC(RFC);
        this.setDepartamento(departamento);
        this.setPuesto(puesto);
    }

    @Override
    public void calcularQuincena() {
        quincena = mensual / 2;
    }
}
