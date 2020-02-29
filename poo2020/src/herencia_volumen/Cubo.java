package herencia_volumen;

public class Cubo extends FiguraVol {

    // Atributos propios de la clase
    private double arista;
    private double volumenCubo;

    /**
     * Metodo constructor
     * @param arista
     */
    public Cubo (double arista, String nombre) {
        this.arista = arista;
        this.nombre = nombre;
    }

    /**
     * Metodo para calcular el volumen del cubo
     * @return volumenCubo
     */
    public double calcularVolumenCubo (){
        volumenCubo = Math.pow(arista,3);
        return volumenCubo;
    }
}
