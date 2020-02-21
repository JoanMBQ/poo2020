package matrizpoo;

public class Matriz  {

    //Declaracion de variables
    private int [][] matrizA = new int[3][3];
    private int [][] matrizB = new int[3][3];
    private int [][] matrizC = new int[3][3];
    private String cadena = "";

     /**
     * Metodo Constructor que recibe parametros del metodo principal
     * @param matrizA
     * @param matrizB
     */
    public Matriz(int[][] matrizA, int[][] matrizB){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }
    public int [][] SumaMatriz(){
        for (int i = 0; i < matrizA.length ; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }
    public String presentar(){
        cadena = String.format("Matriz A\t+\tMatriz B\t=\tMatriz C\n");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                cadena = String.format("%s\t%d\t\t+\t\t%d\t\t=\t\t%d\n",cadena, matrizA[i][j], matrizB[i][j], SumaMatriz()[i][j]);
            }
        }
        return cadena;
    }
}
