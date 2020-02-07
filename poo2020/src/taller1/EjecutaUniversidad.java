package taller1;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        // Creacion de objeto universidad
        Universidad universidad = new Universidad();
        // Metodos Actualizar
        universidad.actualizarTipo("Privada");
        universidad.actualizaEstudiantes("Joan Briceño");
        universidad.actualizarDocente("Richar Guaya");
        universidad.actualizarCarrera("Ciencias de la Computación");
        universidad.actualizarDepartamentos("Area Técnica");
        // Metodos Obtener
        String mostrarCarrera = universidad.obtenerCarrera();
        System.out.println(mostrarCarrera);
        String mostrarDepartamentos = universidad.obtenerDepartamentos();
        System.out.println(mostrarDepartamentos);
        // Todos los datos concatenados
        String mostrarUniversidad = universidad.obtenerUniversidad();
        System.out.println(mostrarUniversidad);
    }
}