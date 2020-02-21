package matrizpoo;
import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        int [][] matrizA = new int[3][3];
        int [][] matrizB = new int[3][3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.printf("Ingrese un valor para el vector A en la posicion %d.%d: ",i,j);
                matrizA[i][j] = teclado.nextInt();
                System.out.printf("Ingrese un valor para el vector B en la posicion %d.%d: ",i,j);
                matrizB[i][j] = teclado.nextInt();
            }
        }
        Matriz matriz = new Matriz(matrizA,matrizB);
        System.out.println(matriz.presentar());
    }
}
