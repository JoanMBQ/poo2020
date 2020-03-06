package polimorfismo_automotriz;

import java.util.Scanner;

public class EjecutaEmpleados {
    public static void main(String[] args) {
        boolean bandera = true;
        int numEmp = 0;
        Scanner entrada = new Scanner(System.in);

        String cadena = String.format("\u001b[30m%55s\u001b[0m\n\033[01m%-15s%-20s%-20s%-20s%-20s\033[0m" +
                        "\n--------------------------------------------------------------------------------------\n",
                        "REPORTE DE NÓMINA QUINCENAL","RFC","NOMBRE", "DEPTO", "PUESTO","SUELDO QUINCENA");

        do {
            System.out.println("Ingrese el tipo de empleado: \u001b[30m\n1. ADMINISTRATIVO \n2. MECANICO \n3. VENDEDOR " +
                    "\n4. SALIR\u001b[0m\nDigite una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 4){
                bandera = false;
            }

            if (opcion == 1){
                String dep = "ADMINISTRATIVO";
                System.out.println("Ingrese su nombre:");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su puesto:");
                String puesto = entrada.nextLine();
                System.out.println("Ingrese su RFC");
                String rfc = entrada.nextLine();
                System.out.println("Ingrese su sueldo mensual");
                double mensual = entrada.nextDouble();
                numEmp += 1 ;

                // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                EmpAdmvo admin = new EmpAdmvo(mensual, nombre,rfc,dep,puesto);
                admin.calcularQuincena();
                // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                cadena = String.format("%s%-15s%-20s%-20s%-20s%-20.2f\n"
                        , cadena, admin.getRFC(), admin.getNombre(),
                        admin.getDepartamento(), admin.getPuesto(), admin.getQuincena());
            }else{
                if (opcion == 2){
                    String dep = "MECANICO";
                    System.out.println("Ingrese su nombre:");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese su puesto:");
                    String puesto = entrada.nextLine();
                    System.out.println("Ingrese su RFC");
                    String rfc = entrada.nextLine();
                    System.out.println("Ingrese la cantidad de trabajos realizados");
                    int numeroTr = entrada.nextInt();
                    System.out.println("Ingrese el valor total de los trabajos realizados");
                    double valorTra = entrada.nextDouble();
                    numEmp += 1 ;

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    EmpMecanico empMecanico = new EmpMecanico(valorTra, numeroTr,nombre,rfc,dep,puesto);
                    empMecanico.calcularQuincena();

                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%-15s%-20s%-20s%-20s%-20.2f\n"
                            , cadena, empMecanico.getRFC(), empMecanico.getNombre(),
                            empMecanico.getDepartamento(), empMecanico.getPuesto(), empMecanico.getQuincena());
                }else{
                    if (opcion == 3){
                        String dep = "VENDEDOR";
                        double salariomin = 400;
                        System.out.println("Ingrese su nombre:");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese su puesto:");
                        String puesto = entrada.nextLine();
                        System.out.println("Ingrese su RFC");
                        String rfc = entrada.nextLine();
                        System.out.println("Ingrese el valor total de las ventas realizadas");
                        double valorV = entrada.nextDouble();
                        numEmp += 1 ;

                        // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                        EmpVendedor empVendedor = new EmpVendedor(valorV, salariomin, nombre,rfc,dep,puesto);
                        empVendedor.calcularQuincena();
                        // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                        cadena = String.format("%s%-15s%-20s%-20s%-20s%-20.2f\n"
                                , cadena, empVendedor.getRFC(), empVendedor.getNombre(), empVendedor.getQuincena(),
                                empVendedor.getPuesto(), empVendedor.getQuincena());
                    }
                }
            }

        }while (bandera);
        System.out.printf("%s--------------------------------------------------------------------------------------\n" +
                "TOTAL \033[01m%d\033[0m EMPLEADOS",cadena, numEmp);
    }
}