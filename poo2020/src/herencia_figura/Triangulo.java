package herencia_figura;

public class Triangulo extends Figura{

    // Atributos propios de la clase
    private double baseTrian;
    private double alturaTrian;
    private double areaTrian;

    public double getBaseTrian() {
        return baseTrian;
    }

    public void setBaseTrian(double baseTrian) {
        this.baseTrian = baseTrian;
    }

    public double getAlturaTrian() {
        return alturaTrian;
    }

    public void setAlturaTrian(double alturaTrian) {
        this.alturaTrian = alturaTrian;
    }

    public void calcularAreaTrian() {
        areaTrian = (baseTrian * alturaTrian)/2;
    }

    public double getAreaTrian() {
        return areaTrian;
    }
}
