package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemplosLista {
    public static void main(String[] args) {

        // Creacion de una lista en java para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String>();
        universidades.add("\033[31mUTPL\033[0m");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("\033[32mESPOL\033[0m");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("\033[34mESPOL\033[0m");
        System.out.println("Tamaño de la lista: "+universidades.size());
        System.out.println(universidades);
        // Eliminacion de elemento en la posicion 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista luego de eliminar elemento: "+universidades.size());
        // Recorremos lista para presentar valores
        System.out.println("VALORES DE LA LISTA");
        // Reemplazamos el valor de una posicion indicada en nuestra fila
        universidades.set(1,"UIDE");
        // Agregamos un valor en la posicion intermedia
        universidades.add(1,"UNL");
        for (int i = 0; i < universidades.size(); i++){
            System.out.println(universidades.get(i));
        }
        // foreach para recorrer la lista de universidades
        for (String univ: universidades){
            System.out.println(univ);
        }
    }
}
