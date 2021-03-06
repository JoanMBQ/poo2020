package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {

        // Declaración de variables
        String nombre;
        String opcion;
        int horasTrabajadas;
        double cuota;
        // Entrada de datos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cuota por hora: ");
        cuota = teclado.nextDouble();
        teclado.nextLine();
        int limite = 1;
        for(int i = 0; i <= limite; i = i + 1){
            System.out.println("Ingrese el nombre del empleado:");
            nombre = teclado.nextLine();
            System.out.println("Ingrese el número de horas trabajadas:");
            horasTrabajadas = teclado.nextInt();

            // Creacion del objeto
            Empleado empleado = new Empleado(nombre, horasTrabajadas);
            // salida de datos
            System.out.println(String.format("Nombre del empleado: %s\nSueldo total: %.2f $", nombre, empleado.calcularSueldo(cuota)));
            System.out.println("Desea calcular el suledo de otro empleado si/no");
            teclado.nextLine();
            opcion = teclado.nextLine();
            if (opcion.equals("si")) {
                limite = limite + 1;
            }else{
                limite = i;
            }
        }
    }
}