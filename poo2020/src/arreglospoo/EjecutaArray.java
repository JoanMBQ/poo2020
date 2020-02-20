package arreglospoo;
import java.util.Scanner;

public class EjecutaArray {

    public static void main(String[] args) {
        int [] vectorA = new int[10];
        int [] vectorB = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("Ingrese un numero del vector A en la posición %d:", i+1);
            vectorA[i] = entrada.nextInt();
            System.out.printf("Ingrese un numero del vector B en la posición %d:", i+1);
            vectorB[i] = entrada.nextInt();
        }
        Array array = new Array(vectorA,vectorB);
        System.out.println(array.presentar());
    }
}