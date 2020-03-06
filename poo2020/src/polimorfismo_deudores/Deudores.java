package polimorfismo_deudores;

public abstract class Deudores {
    protected String nombre;
    protected String numeroC;
    protected double capital;
    protected double plazos;
    protected double totalInteres;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getPlazos() {
        return plazos;
    }

    public void setPlazos(double plazos) {
        this.plazos = plazos;
    }
    public double getTotalInteres() {
        return totalInteres;
    }

    public void setTotalInteres(double totalInteres) {
        this.totalInteres = totalInteres;
    }

    /**
     * Metodo Abstracto que heredaran todas las clases hijas
     */
    public abstract void calcularInteres();
}
