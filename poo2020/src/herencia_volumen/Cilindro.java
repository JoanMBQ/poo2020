package herencia_volumen;

import static java.lang.Math.*;

public class Cilindro extends FiguraVol {
    // Atributos propios de la clase
    private double radioCilindro;
    private double alturaCilindro;
    private double volumenCilindro;

    /**
     * Metodo Constructor
     * @param radioCilindro
     * @param alturaCilindro
     * @param nombre
     */
    public Cilindro(double radioCilindro, double alturaCilindro, String nombre) {
        this.radioCilindro = radioCilindro;
        this.alturaCilindro = alturaCilindro;
        this.nombre = nombre;
    }

    /**
     * Metodo para calcular el volumen del cilindro
     * @return volumenCilindro
     */
    public double calcularVolumenCilindro (){
        volumenCilindro = PI * (Math.pow(radioCilindro, 2) * alturaCilindro);
        return volumenCilindro;
    }
}
