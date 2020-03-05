package polimorfismo_volumen;

import static java.lang.Math.*;

public class CilindroPolimorfismo extends FiguraVolPolimorfismo {
    // Atributos propios de la clase
    private double radioCilindro;
    private double alturaCilindro;

    /**
     * Metodo Constructor
     * @param radioCilindro
     * @param alturaCilindro
     * @param nombre
     */
    public CilindroPolimorfismo(double radioCilindro, double alturaCilindro, String nombre) {
        this.radioCilindro = radioCilindro;
        this.alturaCilindro = alturaCilindro;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = PI * (Math.pow(radioCilindro, 2) * alturaCilindro);
    }
}
