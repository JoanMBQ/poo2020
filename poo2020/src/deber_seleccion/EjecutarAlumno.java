package deber_seleccion;

import java.util.Scanner;

public class EjecutarAlumno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // delcaracion de variables
        String nombre;
        double calif1;
        double calif2;
        double calif3;
        double calif4;


        // Entrada de datos
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la calificacion 1:");
        calif1 = teclado.nextDouble();
        System.out.println("Ingrese la calificacion 2:");
        calif2 = teclado.nextDouble();
        System.out.println("Ingrese la calificacion 3:");
        calif3 = teclado.nextDouble();
        System.out.println("Ingrese la calificacion 4:");
        calif4 = teclado.nextDouble();
        // Creacion del objeto
        Alumno alumno = new Alumno(nombre, calif1, calif2, calif3, calif4);

        // Salida de datos
        System.out.println(alumno.presentar());
    }
}