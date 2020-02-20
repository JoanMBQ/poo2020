package arreglospoo;


import java.util.Arrays;

public class SumaArray {
    // declaracion de variables
    private int arregloA [] = new int [10];
    private int arregloB [] = new int [10];
    private int arregloC [] = new int [10];
    private String cadena = String.format("Arreglo1\t+\tArreglo2\t=\tArreglo3" +
            "\n----------------------------------------\n");

    /**
     * Metodo constructor del objeto SumaArray
     * @param arregloA
     * @param arregloB
     */
    public SumaArray(int[] arregloA, int[] arregloB){
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    /**
     * Metodo para obtener la suma del tercer arreglo
     * @return arregloC
     */
    public int[] calcularSuma(){
        for (int i = 0; i < arregloC.length; i++) {
            arregloC[i]= arregloA[i]+  arregloB[i];
        }
        return arregloC;
    }

    /**
     * Metodo para obtener la salida de datos
     * @return
     */
    public String presentar(){
        for (int i = 0; i < arregloC.length; i++) {
            cadena = String.format("%s%d\t\t\t\t\t%d\t\t\t\t%d\n",
                    cadena, arregloA[i], arregloB[i], calcularSuma()[i]);
        }
        return cadena;
    }
}