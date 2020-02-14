package taller_repeticion;
import java.util.Scanner;
public class EjecutaDivison {
    /**
     * Integrantes: Juan Yanza, Roberto Narvaez, Joan Briceño
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //  declarar variables
        int dividendo;
        int divisor;
        int salir = 1;
        do {
            // entrada de datos
            System.out.println("Ingrese el dividendo: ");
            dividendo = teclado.nextInt();
            System.out.println("Ingrese el divisor");
            divisor = teclado.nextInt();
            // crear objeto
            Division division = new Division(dividendo, divisor);
            // salida de datos
            System.out.println(division.presentar());
            //  validacion para nuevo ingreso de datos
            System.out.println("Desea ingresar mas numeros?\n1.Si\n2.No");
            salir = teclado.nextInt();
            if (salir==2){
                salir =2;
            } else{
                salir = 1;
            }
        }while(salir ==1);
    }
}