package datos_tipo_objeto;

public class Vehiculo {
    private String placa;
    private String marca;
    private String anio;
    private String modelo;
    private String color;
    private double cilindraje;

    public Vehiculo(String placa, String marca, String anio, String modelo, String color, double cilindraje) {
        this.setPlaca(placa);
        this.setMarca(marca);
        this.setAnio(anio);
        this.setModelo(modelo);
        this.setColor(color);
        this.setCilindraje(cilindraje);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
}
