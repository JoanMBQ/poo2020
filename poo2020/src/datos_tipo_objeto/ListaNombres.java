package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        // Creacion de una lista en java para almacenar valores de tipo String
        List<String> nombres = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        int opc;
        int cont = 0;

        do {
            System.out.println("Ingrese una opccion:\n1.Agregar nuevo.\n2.Presentar lista de nombres.\n3.SALIR.");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 1:
                    System.out.printf("\033[35mINGRESE EL NOMBRE N°%d\033[0m\n", cont+1);
                    nombres.add(teclado.nextLine());
                    cont +=1;
                    break;
                case 2:
                    System.out.println("\u001b[31m----------------\u001b[0m");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println(nombres.get(i));
                    }
                    System.out.println("\u001b[31m----------------\u001b[0m");
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
            } while(bandera);
        }
    }