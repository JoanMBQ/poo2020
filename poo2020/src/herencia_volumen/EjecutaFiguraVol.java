package herencia_volumen;

import herencia_empleado.EmpleadoPorHora;

import java.util.Scanner;

public class EjecutaFiguraVol {
    public static void main(String[] args) {

        String nombre;
        double arista;
        double radioCilindro, alturaCilindro, volumenCilindro = 0;
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
                // Creacion del objeto de la clase triangulo
                Cubo cubo = new Cubo(arista, nombre);
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), cubo.calcularVolumenCubo());
                break;
            case ("CILINDRO"):
                System.out.println("Ingrese el radio del cilindro: ");
                radioCilindro = teclado.nextDouble();
                System.out.println("Ingrese la altura del cilindro: ");
                alturaCilindro = teclado.nextDouble();
                // Creacion del objeto de la clase rectangulo
                Cilindro cilindro = new Cilindro(radioCilindro, alturaCilindro, nombre);
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), cilindro.calcularVolumenCilindro());
                break;
            case ("CONO"):
                System.out.println("Ingrese el radio del cono: ");
                radioCono = teclado.nextDouble();
                System.out.println("Ingrese la altura del cono: ");
                alturaCono = teclado.nextDouble();
                // Creacion del objeto de la clase cono
                Cono cono = new Cono(radioCono, alturaCono, nombre);
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), cono.calcularVolumenCono());
                break;
            case ("ESFERA"):
                System.out.println("Ingrese el radio la esfera: ");
                radioEsfera = teclado.nextDouble();
                // Creacion del objeto de la clase esfera
                Esfera esfera = new Esfera(radioEsfera, nombre);
                System.out.printf("Figura: %s\nVolumen: %.2f", nombre.toUpperCase(), esfera.calcularVolumenEsfera());
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
}