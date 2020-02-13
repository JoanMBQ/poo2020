package disenio_seleccion;

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
     * @param cuota
     */
    public Empleado(String nombre, int horasTrabajadas, double cuota){
        this.setNombre(nombre);
        this.setHorasTrabajadas(horasTrabajadas);
        this.setCuota(cuota);
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
    public double calcularSueldo(){
        if (horasTrabajadas <= 40){
            setSueldo(getHorasTrabajadas() * getCuota());
        }else{
            setSueldo((40 * getCuota()) + (getHorasTrabajadas() -40) * (getCuota()*2));
        }
        return getSueldo();
    }
    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String mensaje(){
        String cadena = String.format("Nombre del empleado: %s\nSueldo total: %.2f $", nombre, calcularSueldo());
        return cadena;
    }
}