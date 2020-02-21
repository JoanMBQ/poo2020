package matrizpoo;
import java.util.Scanner;

/**
 * Taller Grupal - Matrices
 * Integrantes: Juan Yanza, Joan Brinceño, Alexander Loja, Roberto Narvaez
 */


public class EjecutaTranspuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // declaracion de variables
        int filas = 0;
        int columnas = 0;

        //  Solicitud y lectura de datos
        System.out.println("Ingrese el numero de filas de su matriz:");
        filas = teclado.nextInt();

        System.out.println("Ingrese el numero de columnas de su matriz:");
        columnas = teclado.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Ingrese el dato de su matriz en la posicion[%d][%d]\n", i+1, j+1);
                matriz[i][j]  = teclado.nextInt();
            }
        }
        // creacion del objeto
        Transpuesta transpuesta = new Transpuesta(filas, columnas, matriz);

        // salida de datos

        System.out.println("Matriz original: \n"+transpuesta.presentarOrigianl());

        System.out.println("Matriz Transpuesta: \n"+transpuesta.presentarTranspuesta());

    }
}
