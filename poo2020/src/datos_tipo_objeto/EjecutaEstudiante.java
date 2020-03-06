package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {
        // Declaracion de variales
        int cont;
        Estudiante estudiante;
        Scanner teclado = new Scanner(System.in);
        Estudiante [] estudiantes = new Estudiante[3];
        Estudiante est = new Estudiante();
        for (cont = 0; cont < estudiantes.length; cont++){
            System.out.println("INGRESO DE NUEVO ESTUDIANTES");

            System.out.println("Ingrese nombre");
            est.setNombre(teclado.nextLine());
            System.out.println("Ingrese cedula");
            est.setCedula(teclado.nextLine());
            System.out.println("Ingrese edad");
            est.setEdad(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Ingrese carrera");
            est.setCarrera(teclado.nextLine());
            System.out.println("Ingrese correo");
            est.setCorreo(teclado.nextLine());
            // Asignamos el objeto a la variable estudiante
            estudiantes[cont] = est;
        }
        // Obtencion de los valores que contiene el tipo de dato Estudiante:
        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("Cedula:\tNombre: ");
        for (cont = 0; cont < estudiantes.length; cont++){
            System.out.println(estudiantes[cont].getCedula()+"\t"+estudiantes[cont].getNombre());
        }
    }
}
