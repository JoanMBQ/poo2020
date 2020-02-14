package taller_repeticion;
import java.util.Scanner;
public class EjecutaCajero{
    /**
     * Integrantes: Juan Yanza, Roberto Narvaez, Joan Briceño
     *
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band;
        band = true;
        int opcion;
        double monto;
        /**
         * Entradas estáticas fuera del ciclo repetitivo
         */
        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su saldo inicial:");
        double saldoi = entrada.nextDouble();
        // Creación del objeto
        Cajero cajero = new Cajero();
        cajero.setNuevo_saldo(saldoi);
        do {
            System.out.println("Digite una opción:");
            System.out.println("********************");
            System.out.println("1. Depósitos");
            System.out.println("2. Retiros");
            System.out.println("3. Consulta saldo");
            System.out.println("********************");
            opcion = entrada.nextInt();

            switch (opcion){
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
                case 1:
                    System.out.println("Ingrese el monto a depositar: ");
                    monto = entrada.nextDouble();
                    cajero.setDeposito(monto);
                    cajero.setNuevo_saldo(cajero.depositarCuenta());
                    System.out.println("El nuevo saldo es: $"+cajero.getNuevo_saldo());
                    System.out.printf("Señor %s Se ha generado con exito el deposito\n",nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    monto = entrada.nextDouble();
                    System.out.println(cajero.getNuevo_saldo());

                    cajero.setRetiro(monto);
                    cajero.setNuevo_saldo(cajero.retirarCuenta());
                    System.out.println(cajero.getNuevo_saldo());
                    System.out.println("El nuevo saldo es: $"+cajero.getNuevo_saldo());
                    System.out.printf("Señor %s Se ha generado con exito el retiro\n", nombre);
                    break;
                case 3:
                    System.out.println("---- Consultando saldo ----");
                    cajero.getNuevo_saldo();
                    System.out.printf("Señor %s su saldo es de: $%.1f\n", nombre, cajero.getNuevo_saldo());
                    break;
            }


            do {
                System.out.println("¿Desea realizar otra acción?\n1. Si\n2. No");
                opcion = entrada.nextInt();
                if (opcion == 2){
                    band = false;
                    System.out.println("-------- Gracias --------");
                }
            }while(opcion < 1 || opcion > 2);

        }while (band);
    }
}