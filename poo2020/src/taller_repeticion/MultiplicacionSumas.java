package taller_repeticion;

public class MultiplicacionSumas {
    /**
     * Integrantes: Juan Yanza, Roberto Narvaez, Joan Briceño
     *
     */
    private double multiplicando, multiplicador, acum;
    public MultiplicacionSumas(double multiplicando, double multiplicador){
        this.multiplicando = multiplicando;
        this.multiplicador= multiplicador;
    }

    public Double calcularMult(){
        for (int i = 0; i < multiplicador; i++) {
            acum = acum + multiplicando;
        }
        return acum;
    }
}