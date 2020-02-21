package matrizpoo;

/**
 * Taller Grupal - Matrices
 * Integrantes: Juan Yanza, Joan Brinceño, Alexander Loja, Roberto Narvaez
 */
public class MatrizPromedio {
    private int filas;
    private int colum;
    private int [][] num = new int[filas][colum];

    /**
     * Metodo constructor que recibe parametros del metodo principal
     * @param num
     * @param filas
     * @param colum
     */
    public MatrizPromedio(int [][] num,int filas,int colum){
        this.num = num;
        this.filas = filas;
        this.colum = colum;
    }
    /**
     * Metodo Suma matriz usando un acumulador suma
     * @return suma
     */
    public int sumaMatriz(){
        int suma = 0;

        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < colum; j++) {
                suma += num[i][j];
            }
        }
        return suma;
    }
    /**
     * Metodo para obtener el promedio
     * @return promedio
     */
    public double promedio(){
        double prom = 0;
        prom = sumaMatriz()/ (filas*colum);
        return prom;
    }
    /**
     * Metodo para presentar la matriz ingresada
     * @param matriz
     * @return cadena
     */
    public String presentar(int [][] matriz){
        String cadena = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                cadena = String.format("%s%d\t\t",cadena,matriz[i][j]);
            }
            cadena = String.format("\n%s\n",cadena);
        }
        return cadena;
    }
}
