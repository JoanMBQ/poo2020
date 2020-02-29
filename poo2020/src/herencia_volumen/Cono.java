package herencia_volumen;

import static java.lang.Math.*;

public class Cono extends FiguraVol {
    // Atributos propios de la clase
    private double radioCono;
    private double alturaCono;
    private double volumenCono;

    /**
     * Metodo Constructor
     * @param radioCono
     * @param alturaCono
     * @param nombre
     */
    public Cono (double radioCono, double alturaCono, String nombre) {
        this.radioCono = radioCono;
        this.alturaCono = alturaCono;
        this.nombre = nombre;
    }

    /**
     * Metodo para calcular el volumen del cono
     * @return volumenCono
     */
    public double calcularVolumenCono (){
        volumenCono = (1 * PI * Math.pow(radioCono, 2) * alturaCono)/3;
        return volumenCono;
    }
}
