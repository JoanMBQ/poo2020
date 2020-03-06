package polimorfismo_inversionistas;

public class CuentaMaestra extends Inversionistas {
    private double capital;

    public CuentaMaestra(String numeroCuenta, double capital, String nombre, double plazo) {
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;
        this.plazo = plazo;
    }

    @Override
    public void calcularInteres(){
        interes = capital * (taza / 100) * plazo;
    }
}
