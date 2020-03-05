package polimorfismo_volumen;

import java.util.Scanner;

public class EjecutaFiguraVolPolimorfismo {
    public static void main(String[] args) {

        String nombre;
        double arista;
        double radioCilindro, alturaCilindro;
        double radioCono, alturaCono;
        double radioEsfera;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Volumen Figuras Geométricas\n----------------------------------------" +
                "\n1.Cubo.\n2.Cilindro.\n3.Cono.\n4.Esfera.\n----------------------------------------");
        System.out.println("Ingrese el nombre de la figura geométrica a calcular: ");
        nombre = teclado.nextLine();
        switch (nombre.toUpperCase()) {
            case ("CUBO"):
                System.out.println("Ingrese la arista del cubo: ");
                arista = teclado.nextDouble();
                // Creacion del objeto de la clase cubo
                CuboPolimorfismo cuboPolimorfismo = new CuboPolimorfismo(arista, nombre);
                cuboPolimorfismo.calcularVolumen();
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), cuboPolimorfismo.getArea());
                break;
            case ("CILINDRO"):
                System.out.println("Ingrese el radio del cilindro: ");
                radioCilindro = teclado.nextDouble();
                System.out.println("Ingrese la altura del cilindro: ");
                alturaCilindro = teclado.nextDouble();
                // Creacion del objeto de la clase cilindro
                CilindroPolimorfismo cilindroPolimorfismo = new CilindroPolimorfismo(radioCilindro, alturaCilindro, nombre);
                cilindroPolimorfismo.calcularVolumen();
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), cilindroPolimorfismo.getArea());
                break;
            case ("CONO"):
                System.out.println("Ingrese el radio del cono: ");
                radioCono = teclado.nextDouble();
                System.out.println("Ingrese la altura del cono: ");
                alturaCono = teclado.nextDouble();
                // Creacion del objeto de la clase cono
                ConoPolimorfismo conoPolimorfismo = new ConoPolimorfismo(radioCono, alturaCono, nombre);
                conoPolimorfismo.calcularVolumen();
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), conoPolimorfismo.getArea());
                break;
            case ("ESFERA"):
                System.out.println("Ingrese el radio la esfera: ");
                radioEsfera = teclado.nextDouble();
                // Creacion del objeto de la clase esfera
                EsferaPolimorfismo esferaPolimorfismo = new EsferaPolimorfismo(radioEsfera, nombre);
                esferaPolimorfismo.calcularVolumen();
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), esferaPolimorfismo.getArea());
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
}