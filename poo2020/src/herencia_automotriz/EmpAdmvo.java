package herencia_automotriz;

public class EmpAdmvo extends Empleados{

    private double quincena;
    private double mensual;

    public EmpAdmvo(double mensual, String nombre, String RFC, String departamento, String puesto) {
        this.mensual = mensual;
        this.nombre = nombre;
        this.RFC = RFC;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public double calcularQuincenaAdmins(){
        quincena = mensual / 2;
        return quincena;
    }
}
