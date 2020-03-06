package polimorfismo_automotriz;

public abstract class Empleados {

    protected String RFC;
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double quincena;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }

    /**
     * Metodo Abstracto que heredaran todas las clases hijas
     */
    public abstract void calcularQuincena();
}
