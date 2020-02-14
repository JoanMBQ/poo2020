package taller_repeticion;
import java.util.Scanner;
public class EjecutaFactorial {
    /**
     * Integrantes: Juan Yanza, Roberto Narvaez, Joan Briceño
     *
     */
    public static void main(String[] args) {
        int numero;
        boolean bandera;
        bandera = true;
        String opcion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();

            Factorial factorial = new Factorial(numero);
            System.out.println(factorial.calcularFactorial());
            entrada.nextLine();
            // Opcion para cambiar el estado de la variable bandera
            System.out.println("Desea Ingresar otro numero? Digite: si ó no");
            opcion = entrada.nextLine();

            if (opcion.equals("no")){
                bandera = false;
            }
        }while(bandera == true);
    }
}