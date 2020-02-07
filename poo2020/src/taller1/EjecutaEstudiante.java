package taller1;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Creacion de objeto estudiante
        Estudiante estudiante = new Estudiante();
        // Metodos Actualizar
        estudiante.actualizarNombre("Joan Briceño");
        estudiante.actualizarDireccion("Clodoveo");
        estudiante.actualizarCiclo("4to");
        estudiante.actualizarEdad(19);
        estudiante.actualizarPromedio(34.14);
        // Metodos Obtener
        String mostrarNombre = estudiante.obtenerNombre();
        System.out.println(mostrarNombre);
        int mostrarEdad = estudiante.obtenerEdad();
        System.out.println(mostrarEdad);
        // Todos los datos concatenados
        String mostrarEstudiante = estudiante.obtenerEstudiante();
        System.out.println(mostrarEstudiante);
    }
}
