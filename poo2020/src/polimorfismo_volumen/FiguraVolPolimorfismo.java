package polimorfismo_volumen;

public abstract class FiguraVolPolimorfismo {
    // Atributos comunes para todas las clases
    protected String nombre;
    protected double volumen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Metodo Abstracto que heredaran todas las clases hijas
     */
    public abstract void calcularVolumen();
}
