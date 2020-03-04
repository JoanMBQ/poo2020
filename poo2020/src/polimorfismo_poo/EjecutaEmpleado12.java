package polimorfismo_poo;

import java.util.Scanner;

public class EjecutaEmpleado12 {

    public static void main(String[] args) {
        double horas, cuota;
        Scanner entrada = new Scanner(System.in);

        //Obtener el sueldo quincenal de un empleado por horas
        System.out.println("Calculo sueldo quincenal empleado por horas");
        System.out.println("ingrese horas trabajadas");
        horas = entrada.nextDouble();
        System.out.println("Ingrese la cuota por hora");
        cuota = entrada.nextDouble();

        EmpleadoPorHoras2 emp1 = new EmpleadoPorHoras2(horas, cuota);
        emp1.calcularSueldoQuincena();
        System.out.println("el sueldo quincenal es: "+emp1.getSueldo());

        System.out.println("Calculo sueldo quincenal empleado por sueldo mensual");
        System.out.println("Ingrese su sueldo mensual");
        double sueldoM = entrada.nextDouble();
        EmpleadoAsalariado2 emp2 = new EmpleadoAsalariado2(sueldoM);
        emp2.calcularSueldoQuincena();
        System.out.println("El sueldo quincenal es: "+ emp2.getSueldo());

    }
}