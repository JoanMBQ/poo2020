package polimorfismo_volumen;

import static java.lang.Math.*;

public class EsferaPolimorfismo extends FiguraVolPolimorfismo {
    // Atributos propios de la clase
    private double radioEsfera;

    /**
     * Metodo Constructor
     * @param radioEsfera
     * @param nombre
     */
    public EsferaPolimorfismo(double radioEsfera, String nombre) {
        this.radioEsfera = radioEsfera;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = (4 * PI * Math.pow(radioEsfera,3))/3;
    }
}