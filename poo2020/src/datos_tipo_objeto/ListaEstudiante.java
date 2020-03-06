package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        int opc = 0;
        int cont = 0;
        System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES");
        do {
            System.out.println("Ingrese una opccion:\n1.AGREGAR NUEVO.\n2.PRESENTAR ESTUDIANTES.\n3.SALIR.");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 1:
                    System.out.printf("\033[33mESTUDIANTE N°%d\033[0m\n", cont+1);
                    System.out.println("Ingrese nombre:");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese cedula:");
                    String cedula = teclado.nextLine();
                    System.out.println("Ingrese edad:");
                    int edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese carrera:");
                    String carrera = teclado.nextLine();
                    System.out.println("Ingrese correo:");
                    String correo = teclado.nextLine();
                    Estudiante estudiante = new Estudiante(nombre, cedula, edad, carrera, correo);
                    estudiantes.add(estudiante);
                    cont +=1;
                    break;
                case 2:
                    System.out.println("\u001b[31m----------------------------------------------------------------------" +
                            "--------\u001b[0m");
                    System.out.printf("\033[0;107m\033[1;91m%-15s%-15s%-15s%-15s%-15s\033[0m\n" +
                            "\u001b[31m------------------" +
                                    "-----------------------------------------------------------" +
                                    "-\n\u001b[0m"
                            ,"Nombre","Cedula","Edad", "Carrera", "Correro");
                    for (Estudiante est: estudiantes) {
                        System.out.printf("\033[0;100m\033[1;96m%-15s%-15s%-15d%-15s%-15s\033[0m\n", est.getNombre(),
                                est.getCedula(), est.getEdad(), est.getCarrera(), est.getCorreo());
                    }
                    System.out.println("\u001b[31m------------------------------------------------------------------------------\u001b[0m");
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
