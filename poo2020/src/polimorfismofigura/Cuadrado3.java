package polimorfismofigura;

public class Cuadrado3 extends  Figura3{
    private  double lado;

    public Cuadrado3(double lado, String nombreF) {
        this.lado = lado;
        this.nombreF = nombreF;
    }

    public void calcularArea() {
        area = Math.pow(lado,2);
    }
}