package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cedula;

        System.out.println("Ingrese su número de cédula:");
        cedula = entrada.nextLine();

        Cedula cedula1 = new Cedula(cedula);
        System.out.println(cedula1.presentar());
    }
}