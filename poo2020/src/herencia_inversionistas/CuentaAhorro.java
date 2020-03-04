package herencia_inversionistas;

public class CuentaAhorro extends Inversionistas {
    private double capital;

    public CuentaAhorro(String numeroCuenta, double capital, String nombre, double plazo ) {
        this.capital = capital;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.plazo = plazo;
        this.taza = getTaza();

    }
    public double calcularInteres(){
        double interes = capital * (taza / 100) * plazo;
        return interes;
    }
}
