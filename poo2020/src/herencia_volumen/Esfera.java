package herencia_volumen;

import static java.lang.Math.*;

public class Esfera extends FiguraVol {
    // Atributos propios de la clase
    private double radioEsfera;
    private double volumenEsfera;

    /**
     * Metodo Constructor
     * @param radioEsfera
     * @param nombre
     */
    public Esfera (double radioEsfera, String nombre) {
        this.radioEsfera = radioEsfera;
        this.nombre = nombre;
    }

    /**
     * Metodo para calcular el volumen de la esfera
     * @return volumenEsfera
     */
    public double calcularVolumenEsfera (){
        volumenEsfera = (4 * PI * Math.pow(radioEsfera,3))/3;
        return volumenEsfera;
    }
}