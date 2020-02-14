package taller_repeticion;

public class Cajero {
    /**
     * Integrantes: Juan Yanza, Roberto Narvaez, Joan Briceño
     *
     */
    private double nuevo_saldo;
    private double monto;


    public double depositarCuenta(){
        nuevo_saldo = nuevo_saldo  + monto;
        return nuevo_saldo;
    }
    public double retirarCuenta(){
        nuevo_saldo =   nuevo_saldo - monto;
        return nuevo_saldo;
    }

    public double getNuevo_saldo() {
        return nuevo_saldo;
    }

    public void setNuevo_saldo(double nuevo_saldo) {
        this.nuevo_saldo = nuevo_saldo;
    }

    public double getDeposito() {
        return monto;
    }

    public void setDeposito(double deposito) {
        this.monto = deposito;
    }

    public void setRetiro(double retiro) {
        this.monto = retiro;
    }
}