package deber_seleccion;

import java.util.Scanner;

public class EjecutarMayorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        double numA;
        double numB;
        double numC;
        double numD;

        // Entrada de datos
        System.out.println("Ingrese el primero numero: ");
        numA = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        numB = teclado.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        numC = teclado.nextDouble();
        System.out.println("Ingrese el cuarto numero: ");
        numD = teclado.nextDouble();

        // Creacion del objeto
        MayorNumero numero = new MayorNumero(numA, numB, numC, numD);

        // salida de datos
        System.out.println(numero.mensaje());
    }
}