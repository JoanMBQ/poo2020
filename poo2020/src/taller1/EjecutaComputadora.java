package taller1;

public class EjecutaComputadora {
    public static void main(String[] args) {
        // Creacion de objeto computadora
        Computadora computadora = new Computadora();
        // Metodos Actualizar
        computadora.actualizarColor("Gris");
        computadora.actualizarMarca("ASUS");
        computadora.actualizarProcesador("Intel Core i7");
        computadora.actualizarVelocidad_Procesador(2.5);
        computadora.actualizarPeso(1.5);
        // Metodos Obtener
        String mostrarMarca = computadora.obtenerMarca();
        System.out.println(mostrarMarca);
        String mostrarColor = computadora.obtenerColor();
        System.out.println(mostrarColor);
        // Todos los datos concatenados
        String mostrarComputadora = computadora.obtenerComputadora();
        System.out.println(mostrarComputadora);
    }
}
