package disenio_seleccion;


public class Dia {
    // Declaración de variables
    private  int numDia;
    private  String EstadoDia;

    // Métodos get y set de las variables globales
    public int getNumDia() {
        return numDia;
    }
    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }
    /**
     * Método constructor para la clase Dia
     * @param numDia
     */
    public Dia(int numDia){
        this.setNumDia(numDia);
    }
    /**
     * Método que evalua el nombre del dia son stwich
     * @return
     */
    public String obtener_Dia(){
        switch (getNumDia()){
            case 1:
                EstadoDia = "Domdingo";
            case 2:
                EstadoDia = "Lunes";
                break;
            case 3:
                EstadoDia = "Martes";
                break;
            case 4:
                EstadoDia = "Miércoles";
                break;
            case 5:
                EstadoDia = "Jueves";
                break;
            case 6:
                EstadoDia = "Viernes";
                break;
            case 7:
                EstadoDia = "Sábado";
                break;
            default:
                EstadoDia = "Opción Incorrecta";
        }
        return EstadoDia;
    }
    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String mensaje(){
        String cadena = String.format("%s",obtener_Dia());
        return  cadena;
    }
}