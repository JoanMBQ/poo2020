package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        // Declaracion de variable
        int numDia;
        // Entrada de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero del día: ");
        numDia = teclado.nextInt();

        // Creacion del objeto
        Dia dia = new Dia(numDia);

        //Salida de datos
        System.out.println(dia.mensaje());
    }
}