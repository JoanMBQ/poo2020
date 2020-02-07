package taller1;

public class EjecutarVehiculo {
    public static void main(String[] args) {
        // Creacion de objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo();
        // Metodos Actualizar
        vehiculo.actualizarMarca("Nissan");
        vehiculo.actualizarOrigen("Japon");
        vehiculo.actualizarPeso(800.12);
        vehiculo.actualizarPrecio(30200.54);
        vehiculo.actualizarCapacidad_Combustible(40.00);
        // Metodos Obtener
        String mostrarMarca = vehiculo.obtenerMarca();
        System.out.println(mostrarMarca);
        double mostrarPrecio = vehiculo.obtenerPrecio();
        System.out.println(mostrarPrecio);
        // Todos los datos concatenados
        String mostrarVehiculo = vehiculo.obtenerVehiculo();
        System.out.println(mostrarVehiculo);
    }
}
