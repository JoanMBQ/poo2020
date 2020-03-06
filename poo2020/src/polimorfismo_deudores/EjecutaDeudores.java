package polimorfismo_deudores;

import java.util.Scanner;

public class EjecutaDeudores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int count = 0;
        String cadena = String.format("\u001b[30m%45s\u001b[0m\n\033[01m%-20s%-20s%-20s%-20s\033[0m" +
                        "\n--------------------------------------------------------------------------------------\n",
                "REPORTE CLIENTES DEUDORES", "No. Cliente","Nombre", "No. Cuenta", "Total Intereses");

        do {

            System.out.println("\"Ingrese el tipo de prestamo: \n1. PRESTAMO HIPOTECARIO \n2. PRESTAMO VEHICULO " +
                    "\n3. PRESTAMO PERSONAL \n4. SALIR \nDigite una opción");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 4){
                bandera = false;
            }
            switch (opcion){
                case 1:
                    System.out.println("Ingrese su nombre:");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese su N° de cuenta:");
                    String numeroC = entrada.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    double capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo hipotecario:");
                    double plazos = entrada.nextDouble();
                    count += 1;

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoHipotecario hipotecario = new PrestamoHipotecario(nombre, capital, plazos, numeroC);
                    hipotecario.calcularInteres();

                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%-20d%-20s%-20s%-20.2f\n", cadena, count,
                            hipotecario.getNombre(), hipotecario.getNumeroC(), hipotecario.getTotalInteres());
                    break;
                case 2:
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroC = entrada.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo vehicular: ");
                    plazos = entrada.nextDouble();
                    count += 1;

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoAuto auto = new PrestamoAuto(nombre, capital, plazos, numeroC);
                    auto.calcularInteres();

                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%-20d%-20s%-20s%-20.2f\n", cadena, count, auto.getNombre(),
                            auto.getNumeroC(), auto.getTotalInteres());
                    break;
                case 3:
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroC = entrada.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo personal:");
                    plazos = entrada.nextDouble();
                    count += 1;

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoPersonal personal = new PrestamoPersonal(nombre, capital, plazos, numeroC);
                    personal.calcularInteres();

                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%-20d%-20s%-20s%-20.2f\n", cadena, count,
                            personal.getNombre(), personal.getNumeroC(), personal.getTotalInteres());
                    break;
                default:
                    System.out.println("Digite una opción correcta");
                    break;
            }

        }while(bandera);
        System.out.printf("%s--------------------------------------------------------------------------------------\n" +
                "TOTAL \033[01m%d\033[0m CLIENTES\n", cadena, count);
    }
}