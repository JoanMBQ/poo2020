package polimorfismo_volumen;

public class CuboPolimorfismo extends FiguraVolPolimorfismo {

    // Atributos propios de la clase
    private double arista;

    /**
     * Metodo constructor
     * @param arista
     */
    public CuboPolimorfismo(double arista, String nombre) {
        this.arista = arista;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista,3);
    }
}
