package polimorfismofigura;

public class Circulo3 extends Figura3{
    private double radio;

    public Circulo3(double radio,String nombreF) {
        this.radio = radio;
        this.nombreF = nombreF;
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(radio,2);
    }
}