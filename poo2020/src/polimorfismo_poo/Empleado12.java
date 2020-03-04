package polimorfismo_poo;

public abstract class Empleado12 {
    /**
     * Definicion de atributos protegidos para que pueda heredar
     */
    protected String nombre;
    protected String dep;
    protected String puesto;
    protected double sueldo;

    /**
     * Metodo que será implementado
     * dentro de las clases hijas
     *
     */
    public abstract void calcularSueldoQuincena();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }
}