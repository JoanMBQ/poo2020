package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaConversorBinario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String numero;
        System.out.println("Ingrese un número compuesto de ceros y unos:");
        numero = entrada.nextLine();

        ConversorBinario conversorBinario = new ConversorBinario(numero);

        System.out.println("Número Binaro: "+numero+" = "+conversorBinario.obtenerDecimal()+" en decimal.");
    }
}