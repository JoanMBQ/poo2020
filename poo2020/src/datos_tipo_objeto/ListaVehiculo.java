package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        int opc = 0;
        int cont = 0;
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        do {
            System.out.println("Ingrese una opccion:\n1.AGREGAR NUEVO.\n2.PRESENTAR VEHICULOS.\n3.SALIR.");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 1:
                    System.out.printf("\033[33mVEHICULO N°%d\033[0m\n", cont+1);
                    System.out.println("Ingrese placa:");
                    String placa = teclado.nextLine();
                    System.out.println("Ingrese marca:");
                    String marca = teclado.nextLine();
                    System.out.println("Ingrese año:");
                    String anio = teclado.nextLine();
                    System.out.println("Ingrese modelo:");
                    String modelo = teclado.nextLine();
                    System.out.println("Ingrese color:");
                    String color = teclado.nextLine();
                    System.out.println("Ingrese cilindraje:");
                    double cilindraje = teclado.nextDouble();
                    Vehiculo vehiculo = new Vehiculo(placa, marca, anio, modelo, color, cilindraje);
                    vehiculos.add(vehiculo);
                    cont +=1;
                    break;
                case 2:
                    System.out.println("\u001b[31m----------------------------------------------------------\u001b[0m");
                    System.out.printf("%-15s%-15s%-15s","Placa","Marca","Cilindraje");
                    for (Vehiculo vehi: vehiculos) {
                        System.out.printf("%-15s%-15s%-15.2f\n", vehi.getPlaca(), vehi.getMarca(), vehi.getCilindraje());
                    }
                    System.out.println("\u001b[31m----------------------------------------------------------\u001b[0m");
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        } while (bandera);
    }
}
