package intropoo;

public class EjecutaTiempo {
    public static void main(String[] args) {
        //creacion de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizarHora(10);
        tiempo.actualizarMinuto(51);
        tiempo.actualizarSegundo(35);
        String mostrarTiempo = tiempo.obtenerTiempo();
        System.out.println(mostrarTiempo);
    }
}
