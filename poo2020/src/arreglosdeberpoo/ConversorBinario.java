package arreglosdeberpoo;

public class ConversorBinario {

    //Declaracion de variables
    private String numero;
    private int decimal;
    private  int posicion;

    /**
     * Metodo Constructor que recibe parametros del metodo principal
     * @param numero
     */
    public ConversorBinario(String numero){
        this.numero = numero;
    }
    /**
     * Metodo parse para convertir de String -> intArray
     * @return numeros
     */
    public int[] parse(){
        int[] numeros = new int[numero.length()];
        for(int i=0; i<numero.length(); i++){
            numeros[i] = Character.getNumericValue(numero.charAt(i));
        }
        return numeros;
    }
    /**
     * Metodo para convertir de binario a decimal
     * @return decimal
     */
    public int obtenerDecimal(){
        for (int i = parse().length-1; i >=0 ; i--) {
            double multiplicador = Math.pow(2,posicion);
            decimal += parse()[i] * multiplicador;
            posicion++;
        }
        return decimal;
    }
}
