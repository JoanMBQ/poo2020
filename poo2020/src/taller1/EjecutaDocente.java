package taller1;

public class EjecutaDocente {
    public static void main(String[] args) {
    // Creacion de objeto docente
    Docente docente = new Docente();
    // Metodos Actualizar
        docente.actualizarNombre("Richar Guaya");
        docente.actualizaCorreo("rguaya@utpl.edu.ec");
        docente.actualizarTitulo("Ingenieria");
        docente.actualizarArea_Trabajo("Area Técnica");
        docente.actualizarEdad(30);
    // Metodos Obtener
    String mostrarNombre = docente.obtenerNombre();
        System.out.println(mostrarNombre);
    int mostrarEdad = docente.obtenerEdad();
        System.out.println(mostrarEdad);
    // Todos los datos concatenados
    String mostrarDocente = docente.obtenerDocente();
        System.out.println(mostrarDocente);
    }
}
