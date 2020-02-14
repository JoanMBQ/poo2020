package taller_repeticion;

public class Division {
    /**
     * Integrantes: Juan Yanza, Roberto Narvaez, Joan Briceño
     *
     */
    // declaracion de variables
    private int dividendo;
    private int divisor;
    private int contador;

    /**
     * Metodo constructor de division
     * @param dividendo
     * @param divisor
     */
    public Division(int dividendo, int divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    /**
     * Metodo para obtener division mediante restas sucesivas
     * @return contador
     */
    public int obtenerDivision(){
        contador = 0;
        dividendo = dividendo - divisor;
        while (dividendo >= 0 ){
            contador = contador + 1;
            dividendo = dividendo - divisor;
        }
        return contador;
    }

    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("La division es igual a: %d", obtenerDivision());
        return cadena;
    }
}