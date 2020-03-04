package herencia_automotriz;

public class EmpVendedor extends Empleados{

    private double salarioMin;
    private double quincena;
    private double ventas;

    public EmpVendedor(double salarioMin, double ventas, String nombre, String RFC, String departamento, String puesto) {
        this.salarioMin = salarioMin;
        this.ventas = ventas;
        this.nombre = nombre;
        this.RFC = RFC;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public double calcularQuincenaVendedores(){
        quincena = salarioMin + (0.02 * ventas);
        return quincena;
    }
}
