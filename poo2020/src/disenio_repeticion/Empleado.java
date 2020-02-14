package disenio_repeticion;

public class Empleado {
    // Declaración de variables
    private String nombre;
    private int horasTrabajadas;
    private double cuota;
    private double sueldo;
    /**
     * Método Constructor de la Clase Empleado
     * @param nombre
     * @param horasTrabajadas
     */
    public Empleado(String nombre, int horasTrabajadas){
        this.setNombre(nombre);
        this.setHorasTrabajadas(horasTrabajadas);
    }
    // Métodos get y set de las variables globales
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para calcular el sueldo
     * @return
     */
    public double calcularSueldo(double cuota){
        if (horasTrabajadas <= 40){
            setSueldo(getHorasTrabajadas() * cuota);
        }else{
            setSueldo((40 * cuota) + (getHorasTrabajadas() -40) * (cuota*2));
        }
        return getSueldo();
    }
}