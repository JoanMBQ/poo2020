package herencia;

import java.util.Scanner;

public class EjecutaPersonal {

    public static void main(String[] args) {

        String nombre, identificacion, estado_civil, carrera, area, dependencia, fecha_nacimiento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione la opcion a crear:\n1.Estudiante\n2.Docente\n3.Administrativo");
        int opcion = teclado.nextInt();
        teclado.nextLine();

        switch(opcion){
            case 1:
                System.out.println("CREACIÓN DE OBJETO ESTUDIANTE");
                System.out.println("Ingrese el nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese la identificación: ");
                identificacion = teclado.nextLine();
                System.out.println("Ingrese la carrera: ");
                carrera = teclado.nextLine();
                System.out.println("Ingrese el estado civil: ");
                estado_civil = teclado.nextLine();
                System.out.println("Ingrese fecha de nacimiento: ");
                fecha_nacimiento = teclado.nextLine();

                // Creacion del objeto de la clase estudiante
                Estudiante est = new Estudiante(carrera, nombre, identificacion, estado_civil, fecha_nacimiento);

                System.out.println("-------------------------------------");
                System.out.println("Datos de objeto estudiante");
                System.out.printf("Nombre: %s\nIdentificación: %s\nCarrera: %s\nEstado Civil: %s\nFecha de nacimiento: %s"
                , nombre, identificacion, carrera, estado_civil, fecha_nacimiento);
                break;
            case 2:
                System.out.println("CREACIÓN DE OBJETO DOCENTE");
                System.out.println("Ingrese el nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese la identificación: ");
                identificacion = teclado.nextLine();
                System.out.println("Ingrese el area: ");
                area = teclado.nextLine();
                System.out.println("Ingrese el estado civil: ");
                estado_civil = teclado.nextLine();
                System.out.println("Ingrese fecha de nacimiento: ");
                fecha_nacimiento = teclado.nextLine();

                // Creacion del objeto de la clase estudiante
                Docente doc = new Docente(area, nombre, identificacion, estado_civil, fecha_nacimiento);

                System.out.println("-------------------------------------");
                System.out.println("Datos de objeto estudiante");
                System.out.printf("Nombre: %s\nIdentificación: %s\nArea: %s\nEstado Civil: %s\nFecha de nacimiento: %s"
                        , nombre, identificacion, area, estado_civil, fecha_nacimiento);
                break;
            case 3:
                System.out.println("CREACIÓN DE OBJETO ADMINISTRATIVO");
                System.out.println("Ingrese el nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese la identificación: ");
                identificacion = teclado.nextLine();
                System.out.println("Ingrese la dependencia: ");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el estado civil: ");
                estado_civil = teclado.nextLine();
                System.out.println("Ingrese fecha de nacimiento: ");
                fecha_nacimiento = teclado.nextLine();

                // Creacion del objeto de la clase estudiante
                Administrativo adm = new Administrativo(dependencia, nombre, identificacion, estado_civil, fecha_nacimiento);

                System.out.println("-------------------------------------");
                System.out.println("Datos de objeto estudiante");
                System.out.printf("Nombre: %s\nIdentificación: %s\nDependencia: %s\nEstado Civil: %s\nFecha de nacimiento: %s"
                        , nombre, identificacion, dependencia, estado_civil, fecha_nacimiento);
                break;
        }
    }
}

