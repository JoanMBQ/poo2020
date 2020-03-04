package herencia_automotriz;

import java.util.Scanner;

public class EjecutaEmpleados {
    public static void main(String[] args) {
        boolean bandera = true;
        int numEmp = 0;
        Scanner entrada = new Scanner(System.in);

        String cadena = String.format("%50s\n%-10s%-20s%-20s%-20s%-20s\n","REPORTE DE NÓMINA QUINCENAL","RFC","NOMBRE",
                "DEPTO", "PUESTO","SUELDO QUINCENA");
        do {
            System.out.println("Ingrese el tipo de empleado: \n1. ADMINISTRATIVO \n2. MECANICO \n3. VENDEDOR \n4. SALIR" +
                    "\nDigite una opción: ");
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

                // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                cadena = String.format("%s%-10s%-20s%-20s%-20s%-20.2f\n"
                        , cadena, admin.getRFC(), admin.getNombre(),
                        admin.getDepartamento(), admin.getPuesto(), admin.calcularQuincenaAdmins());
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

                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%-10s%-20s%-20s%-20s%-20.2f\n"
                            , cadena, empMecanico.getRFC(), empMecanico.getNombre(),
                            empMecanico.getDepartamento(), empMecanico.getPuesto(), empMecanico.calcularQuincenaMecanicos());
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
                        // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                        cadena = String.format("%s%-10s%-20s%-20s%-20s%-20.2f\n"
                                , cadena, empVendedor.getRFC(), empVendedor.getNombre(), empVendedor.getDepartamento(),
                                empVendedor.getPuesto(), empVendedor.calcularQuincenaVendedores());
                    }
                }
            }

        }while (bandera);
        System.out.printf("%s\nTOTAL %d EMPLEADOS",cadena, numEmp);
    }
}