package taller_repeticion;
import java.util.Scanner;
public class EjecutaMultiplicacionSumas {
    /**
     * Integrantes: Juan Yanza, Roberto Narvaez, Joan Briceño
     *
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = true;
        double multiplicando, multiplicador;
        int opcion;

        do {
            System.out.println("Ingrese el multiplicando");
            multiplicando = entrada.nextDouble();
            System.out.println("Ingrese el multiplicador");
            multiplicador = entrada.nextDouble();
            MultiplicacionSumas obj = new MultiplicacionSumas(multiplicando,multiplicador);

            System.out.printf("El resultado de la multiplicacion %.0fx%.0f es: %.1f\n",
                    multiplicando,multiplicador,obj.calcularMult());

            // Opcion para cambiar el estado de la variable bandera
            System.out.println("Desea ingresar otro numero? Digite: 1. si/ 2. no");
            opcion = entrada.nextInt();
            if (opcion == 2){
                band = false;
            }
        }while(band);
    }
}