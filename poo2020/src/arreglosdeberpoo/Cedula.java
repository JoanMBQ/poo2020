package arreglosdeberpoo;

public class Cedula {

    //Declaracion de variables
    private int producto, residuo, suma, dv;
    private String cedula, cadena;
    private int[] coeficiente = {2, 1, 2, 1, 2, 1, 2, 1, 2};

    /**
     * Metodo Constructor que recibe parametros del metodo principal
     * @param cedula
     */
    public Cedula(String cedula) {
        this.cedula = cedula;
    }
    /**
     * Metodo parse para transformar de String -> intArray
     * @return numeros
     */
    public int[] parse() {
        int[] numeros = new int[cedula.length()];
        for (int i = 0; i < cedula.length(); i++) {
            numeros[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return numeros;
    }
    /**
     * Metodo para retornar el dígito verificador
     * @return dv
     */
    public int obtenerDigitoV() {
        suma = 0;
        residuo = 0;
        for (int i = 0; i < 9; i++) {
            producto = parse()[i] * coeficiente[i];
            //  Condición que si los productos con la constante son mayores o iguales a 19 se resta 9
            if (producto >= 10) {
                producto = producto - 9;
            }
            suma = suma + producto;
        }
        residuo = suma % 10;
        dv = 10 - residuo;
        // Condición que en caso del digito verificador ser 10 se le asigna 0
        if (dv == 10){
            dv = 0;
        }
        return dv;
    }
    /**
     * Metodo para presentar si la cedula es correcta o no
     * @return cadena
     */
    public String presentar () {
        if (parse()[9] == obtenerDigitoV()) {
            cadena = String.format("Numero de Cédula: %s\nDígito verificador: %d", cedula, obtenerDigitoV());
        } else {
            cadena = String.format("Cédula Incorrecta");
        }
        return cadena;
    }
}