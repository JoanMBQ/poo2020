package polimorfismofigura;

public class Rectangulo3 extends Figura3{
    private double base;
    private double altura;

    public Rectangulo3(double base, double altura, String nombreF) {
        this.base = base;
        this.altura = altura;
        this.nombreF = nombreF;
    }

    public void calcularArea() {
        area = base*altura;
    }
}