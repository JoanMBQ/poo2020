package herencia_inversionistas;

public class Pagare extends Inversionistas {
    private double capital;

    public Pagare(String numeroCuenta, double capital,String nombre, double plazo ) {
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;
        this.plazo = plazo;
    }

    public double calcularInteres(){
        double interes = capital * (taza / 100) * plazo;
        return interes;
    }
}
