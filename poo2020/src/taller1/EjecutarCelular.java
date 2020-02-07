package taller1;

public class EjecutarCelular {
    public static void main(String[] args) {
        // Creacion de objeto celular
        Celular celular = new Celular();
        // Metodos Actualizar
        celular.actualizarMarca("Xiaomi");
        celular.actualizarProcesador("SnapDragon");
        celular.actualizarAlmacenamiento(128);
        celular.actualizarRam(4);
        celular.actualizarPrecio(300.50);
        // Metodos Obtener
        String mostrarMarca = celular.obtenerMarca();
        System.out.println(mostrarMarca);
        double mostrarPrecio = celular.obtenerPrecio();
        System.out.println(mostrarPrecio);
        // Todos los datos concatenados
        String mostrarCelular = celular.obtenerCelular();
        System.out.println(mostrarCelular);
    }
}
