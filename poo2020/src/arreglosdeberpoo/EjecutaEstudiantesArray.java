package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaEstudiantesArray {
    public static void main(String[] args) {

        String [] nombre = new String[5];
        String[] celular = new String[5];
        String[] universidad = new String[5];
        int [] edad = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nombre.length; i++) {
            System.out.printf("Ingrese el nombre del estudiante #%d\n",i+1);
            nombre[i] = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            edad[i] = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese la Universidad del estudiante: ");
            universidad[i] = teclado.nextLine();
            System.out.println("Ingrese el numero de celular del estudiante: ");
            celular[i] = teclado.nextLine();
        }
        EstudiantesArray estudiantesArray = new EstudiantesArray(nombre,celular,universidad,edad);
        System.out.println(estudiantesArray.presentar());
    }
}