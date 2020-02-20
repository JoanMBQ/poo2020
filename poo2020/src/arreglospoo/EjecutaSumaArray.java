package arreglospoo;

import java.util.Scanner;
public class EjecutaSumaArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // declaracion de variables
        int arregloA [] = new int [10];
        int arregloB [] = new int [10];
        // entrada y lectura de datos
        for (int i = 0; i < arregloA.length; i++) {
            System.out.printf("Introduzca el valor del vector A en la posicion %d\n",i+1);
            arregloA[i] = teclado.nextInt();
            System.out.printf("Introduzca el valor del vector B en la posicion %d\n", i+1);
            arregloB[i] = teclado.nextInt();
        }
        // creacion del objeto
        SumaArray sumaArray = new SumaArray(arregloA, arregloB);
        //  salida de datos
        System.out.println(sumaArray.presentar());
    }
}