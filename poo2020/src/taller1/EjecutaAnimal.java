package taller1;

public class EjecutaAnimal {
    public static void main(String[] args) {
        // Creacion de objeto animal
        Animal animal = new Animal();
        // Metodos Actualizar
        animal.actualizarTipo("Ave");
        animal.actualizarNombre("Gallina");
        animal.actualizarEspecie("Gallus gallus domesticus");
        animal.actualizarTipo_Reproduccion("Oviparos");
        animal.actualizarPeso(1.8);
        // Metodos Obtener
        String mostralTipo = animal.obtenerTipo();
        System.out.println(mostralTipo);
        String mostrarNombre = animal.obtenerNombre();
        System.out.println(mostrarNombre);
        // Todos los datos concatenados
        String mostralAnimal = animal.obtenerAnimal();
        System.out.println(mostralAnimal);
    }
}