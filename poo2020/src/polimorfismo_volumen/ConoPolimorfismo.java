package polimorfismo_volumen;

import static java.lang.Math.*;

public class ConoPolimorfismo extends FiguraVolPolimorfismo {
    // Atributos propios de la clase
    private double radioCono;
    private double alturaCono;

    /**
     * Metodo Constructor
     * @param radioCono
     * @param alturaCono
     * @param nombre
     */
    public ConoPolimorfismo(double radioCono, double alturaCono, String nombre) {
        this.radioCono = radioCono;
        this.alturaCono = alturaCono;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = (1 * PI * Math.pow(radioCono, 2) * alturaCono)/3;
    }
}
