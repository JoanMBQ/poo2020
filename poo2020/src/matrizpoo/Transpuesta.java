package matrizpoo;

/**
 * Taller Grupal - Matrices
 * Integrantes: Juan Yanza, Joan Brinceño, Alexander Loja, Roberto Narvaez
 */

public class Transpuesta {
    // Declaracion de variables
    private int filas = 0;
    private int columnas = 0;
    private int[][] matriz = new int[filas][columnas];


    //  ingreso a la columna y seguidamente fila de la matriz original
    // para darle el tamanio transpuesto a la matrizT


    public Transpuesta(int filas, int columnas, int[][] matriz){
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = matriz;
    }


    /**
     * Metodo para obtener transpuesta
     * @return matrizT
     */
    public int[][] obtenerTranspuesta(){
        int[][] matrizT = new int[columnas][filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        return matrizT;
    }

    /**
     * Metodo para presentar matriz original
     * @return cadena
     */
    public String presentarOrigianl(){
        String cadena = "";
        for (int i=0; i < filas; i++){
            for (int j=0; j < columnas; j++){
                cadena = String.format("%s\t%d\t", cadena, matriz[i][j]);
            }
            cadena = String.format("\n%s\n", cadena);
        }
        return cadena;
    }

    /**
     * Metodo para presentar matriz transpuesta
     * @return cadena2
     */
    public String presentarTranspuesta(){
        String cadena2 = "";
        for (int i=0; i < columnas; i++){
            for (int j=0; j < filas; j++){
                cadena2 = String.format("%s\t%d\t", cadena2, obtenerTranspuesta()[i][j]);
            }
            cadena2 = String.format("\n%s\n", cadena2);
        }
        return cadena2;
    }
}
