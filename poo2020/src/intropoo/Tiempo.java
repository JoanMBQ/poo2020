package intropoo;

public class Tiempo {

    //definición de atributos
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return hora
     */
    public int obtenerHora() {

        return hora;
    }
    /**
     * Metodo para obtener el valor de la variable minuto
     * @return minuto
     */
    public int obtenerMinuto() {
        return minuto;
    }
    /**
     * Metodo para obtener el valor de la variable segundo
     * @return segundo
     */
    public int obtenersegundo() {
        return segundo;
    }
    /**
     * Metodo para obtener el valor de la variable tiempo
     * @return tiempo
     */
    public String obtenerTiempo() {
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }
    /**
     * Metodo para actualizar el valor de la variable hora
     * @param hora
     */
    public void actualizarHora(int hora){
    // this. hace referencia a la variable global
        this.hora = hora;
    }
    /**
     * Metodo para actualizar el valor de la variable minuto
     * @param minuto
     */
    public void actualizarMinuto(int minuto){
        this.minuto = minuto;
    }
    /**
     * Metodo para actualizar el valor de la variable segundo
     * @param segundo
     */
    public void actualizarSegundo(int segundo){
        this.segundo = segundo;
    }
}
