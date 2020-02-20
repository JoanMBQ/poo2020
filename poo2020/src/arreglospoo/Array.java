package arreglospoo;
import java.util.Arrays;

public class Array {
    int[] vectorA;
    int[] vectorB;
    int sumatoria_producto = 0;
    String cadena;
    public Array(int [] vectorA, int [] vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public int obtenerSumatoria(){
        for (int i = 0; i < vectorA.length; i++) {
            sumatoria_producto = sumatoria_producto + (vectorA[i] * vectorB[i]);
        }
        return sumatoria_producto;
    }

    public String presentar(){
        cadena = "La sumatoria del producto del vectora A "
                + Arrays.toString(vectorA)+" por el vector B "+Arrays.toString(vectorB)+" es: "+ obtenerSumatoria();
        return cadena;
    }
}
