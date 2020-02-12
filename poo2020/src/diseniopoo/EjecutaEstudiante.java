package diseniopoo;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Crear el scanner para la entrada de datos por teclado
        Scanner teclado = new Scanner(System.in);

        // Pedir que ingrese la informacion por teclado
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la materia a calcular el promedio:");
        String materia = teclado.nextLine();
        System.out.println("Ingrese la nota del 1er bimestre:");
        Double nota1 = teclado.nextDouble();
        System.out.println("Ingrese la nota del 2do bimestre:");
        Double nota2 = teclado.nextDouble();

        // Llamar a la clase estudiante para crear el objeto e imprimir el mensaje
        Estudiante estudiante = new Estudiante(nombre, materia, nota1, nota2);
        System.out.println("----------------------------------------");
        System.out.println(estudiante.mensaje());
        System.out.println("----------------------------------------");
    }
}