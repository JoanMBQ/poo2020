package polimorfismofigura;

public abstract class Figura3 {
    protected String nombreF;
    protected double area;

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public abstract void calcularArea();
}