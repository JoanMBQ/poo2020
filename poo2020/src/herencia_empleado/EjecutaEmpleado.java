package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {

        String nombre, cargo, dependencia;
        int horas;
        double valorMensual, valorHora;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione la opcion a crear:\n1.Empleado por hora\n2.Empleado asalariado");
        int opcion = teclado.nextInt();
        teclado.nextLine();

        switch(opcion){
            case 1:
                System.out.println("CREACIÓN DE OBJETO EMPLEADO POR HORA");
                System.out.println("Ingrese el nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese la dependencia: ");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese número de horas trabajadas: ");
                horas = teclado.nextInt();
                System.out.println("Ingrese la cuota por hora trabajada: ");
                valorHora = teclado.nextDouble();

                // Creacion del objeto de la clase estudiante
                EmpleadoPorHora EmpHora = new EmpleadoPorHora(horas, valorHora, nombre, cargo, dependencia);
                System.out.println(EmpHora.presentar());
                break;
            case 2:
                System.out.println("CREACIÓN DE OBJETO EMPLEADO ASALARIADO");
                System.out.println("Ingrese el nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese la dependencia: ");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el sueldo por mes: ");
                valorMensual = teclado.nextDouble();


                // Creacion del objeto de la clase estudiante
                EmpleadoAsalariado EmpAsalariado = new EmpleadoAsalariado(valorMensual,nombre, cargo, dependencia);
                System.out.println(EmpAsalariado.presentar());
                break;
        }
    }
}
