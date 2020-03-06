package polimorfismo_automotriz;

public class EmpVendedor extends Empleados{

    private double salarioMin;
    private double quincena;
    private double ventas;

    public EmpVendedor(double salarioMin, double ventas, String nombre, String RFC, String departamento, String puesto) {
        this.salarioMin = salarioMin;
        this.ventas = ventas;
        this.setNombre(nombre);
        this.setRFC(RFC);
        this.setDepartamento(departamento);
        this.setPuesto(puesto);
    }

    @Override
    public void calcularQuincena() {
        quincena = salarioMin + (0.02 * ventas);
    }
}
