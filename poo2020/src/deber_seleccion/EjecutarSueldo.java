package deber_seleccion;

import java.util.Scanner;

public class EjecutarSueldo {
    public static void main(String[] args) {

        // Declaración de variables
        String nombre;
        int horasTrabajadas;
        double cuota;

        Scanner teclado = new Scanner(System.in);
        // Entrada de datos
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el número de horas trabajadas: ");
        horasTrabajadas  = teclado.nextInt();
        System.out.println("Ingrese la cuota por hora: ");
        cuota = teclado.nextDouble();

        // Creacion del objeto
        Sueldo sueldo1 = new Sueldo(nombre, horasTrabajadas, cuota);
        // salida de datos
        System.out.println(sueldo1.mensaje());
    }
}