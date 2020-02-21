package matrizpoo;
import java.util.Scanner;

/**
 * Taller Grupal - Matrices
 * Integrantes: Juan Yanza, Joan Brinceño, Alexander Loja, Roberto Narvaez
 */

public class EjecutaMatrizPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int colum = entrada.nextInt();
        int [][] numeros = new int[filas][colum];
        /**
         * Ingreso de datos a la matriz
         */
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.printf("Ingrese un numero para la posición: (%d,%d)",i,j);
                numeros[i][j] = entrada.nextInt();
            }
        }
        /**
         * Creación del objeto mps
         */
        MatrizPromedio mps = new MatrizPromedio(numeros, filas,colum);

        System.out.printf("Matriz Ingresada: %s\n", mps.presentar(numeros));
        System.out.printf("SUMA DE LA MATRIZ: %d\n", mps.sumaMatriz());
        System.out.printf("PROMEDIO DE LA MATRIZ %.2f:", mps.promedio());
    }
}