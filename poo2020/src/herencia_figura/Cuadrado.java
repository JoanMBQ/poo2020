package herencia_figura;

public class Cuadrado extends Figura{
    // Atributos propios de la clase
    private double ladoCuad;
    private double areaCuad;

    public double getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    public double getAreaCuadrado() {
        return areaCuad;
    }

    public void calcularAreaCuadrado() {
        areaCuad = Math.pow(ladoCuad,2);
    }
}
