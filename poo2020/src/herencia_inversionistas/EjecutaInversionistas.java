package herencia_inversionistas;

import java.util.Scanner;

public class EjecutaInversionistas {
    public static void main(String[] args) {
        String nombre, cuenta;
        double capital, plazo;
        boolean bandera = true;
        int count = 0;
        Scanner entrada = new Scanner(System.in);
        String cadena = String.format("%50s\n%-20s%-20s%-20s%-20s\n","REPORTE INVERSIONITAS","No. Cliente","Nombre",
                "No. Cuenta", "Interés Ganado");

        do {
            System.out.println("Ingrese el tipo de cuenta inversión: \n1. CUENTA DE AHORRO \n2. CUENTA MAESTRA " +
                    "\n3. PAGARE \n4. SALIR \nDigite una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 4){
                bandera = false;
            }
            switch (opcion){
                case 1:
                    System.out.println("Ingrese su N° de cuenta:");
                    cuenta = entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = entrada.nextDouble();
                    count += 1;

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    CuentaAhorro ahorro = new CuentaAhorro(cuenta, capital, nombre, plazo);
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%-20s%-20d%-20s%-20s%-20.2f\n",cadena, count, ahorro.getNombre(),
                            ahorro.getNumeroCuenta(), ahorro.calcularInteres());
                    break;
                case 2:
                    System.out.println("Ingrese su N° de cuenta:");
                    cuenta = entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = entrada.nextDouble();
                    count += 1;

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    CuentaMaestra maestra = new CuentaMaestra(cuenta, capital, nombre, plazo);
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%-20s%-20d%-20s%-20s%-20.2f\n",cadena, count, maestra.getNombre(),
                            maestra.getNumeroCuenta(), maestra.calcularInteres());
                    break;
                case 3:
                    System.out.println("Ingrese su N° de cuenta:");
                    cuenta = entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = entrada.nextDouble();
                    count += 1;

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    Pagare pagare = new Pagare(cuenta, capital, nombre, plazo);
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%-20s%-20d%-20s%-20s%-20.2f\n",cadena, count, pagare.getNombre(),
                            pagare.getNumeroCuenta(), pagare.calcularInteres());
                    break;
                default:
                    System.out.println("Digite una opción correcta");
            }
        }while(bandera);
        System.out.printf("%s\nTOTAL %d INVERSIONES\n", cadena, count);
    }
}
