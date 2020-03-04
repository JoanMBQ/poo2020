package polimorfismofigura;

public class Triangulo3 extends Figura3 {
    private double base, altura;

    public Triangulo3(double base, double altura, String nombreF) {
        this.base = base;
        this.altura = altura;
        this.nombreF = nombreF;
    }

    @Override
    public void calcularArea() {
        area = (base*altura)/2;
    }
}