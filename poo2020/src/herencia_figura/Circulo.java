package herencia_figura;
import static java.lang.Math. *;

public class Circulo extends Figura{
    // Atributos propios de la clase
    private double radio;
    private double areaCirculo;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public void calcularAreaCirculo() {
        areaCirculo = PI * Math.pow(radio,2);
    }
}
