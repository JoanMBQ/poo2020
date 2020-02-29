package herencia_figura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        String nombre;
        double baseTrian ,alturaTrian, alturaRecta, baseRecta, radio, lado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Áreas Figuras Geométricas\n----------------------------------------" +
                "\n1.Triangulo.\n2.Rectangulo.\n3.Cuadrado.\n4.Circulo.\n----------------------------------------");
        System.out.println("Ingrese el nombre de la figura geométrica a calcular: ");
        nombre = teclado.nextLine();
        switch (nombre.toUpperCase()) {
            case ("TRIANGULO"):
                System.out.println("Ingrese la base del triangulo: ");
                baseTrian = teclado.nextDouble();
                System.out.println("Ingrese la altura del triangulo: ");
                alturaTrian = teclado.nextDouble();
                // Creacion del objeto de la clase triangulo
                Triangulo triangulo = new Triangulo();
                triangulo.setAlturaTrian(baseTrian);
                triangulo.setBaseTrian(alturaTrian);
                triangulo.setNombre(nombre);
                triangulo.calcularAreaTrian();
                System.out.printf("Figura: %s\nÁrea: %.2f", nombre.toUpperCase(), triangulo.getAreaTrian());
                break;
            case ("RECTANGULO"):
                System.out.println("Ingrese la base del rectangulo: ");
                baseRecta = teclado.nextDouble();
                System.out.println("Ingrese la altura del rectangulo: ");
                alturaRecta = teclado.nextDouble();
                // Creacion del objeto de la clase rectangulo
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.setAlturaRecta(baseRecta);
                rectangulo.setBaseRecta(alturaRecta);
                rectangulo.setNombre(nombre);
                rectangulo.calcularAreaRecta();
                System.out.printf("Figura: %s\nÁrea: %.2f", nombre.toUpperCase(), rectangulo.getAreaRecta());
                break;
            case ("CUADRADO"):
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = teclado.nextDouble();
                // Creacion del objeto de la clase triangulo
                Cuadrado cuadrado = new Cuadrado();
                cuadrado.setLadoCuad(lado);
                cuadrado.setNombre(nombre);
                cuadrado.calcularAreaCuadrado();
                System.out.printf("Figura: %s\nÁrea: %.2f", nombre.toUpperCase(), cuadrado.getAreaCuadrado());
                break;
            case ("CIRCULO"):
                System.out.println("Ingrese el radio del circulo: ");
                radio = teclado.nextDouble();
                // Creacion del objeto de la clase triangulo
                Circulo circulo = new Circulo();
                circulo.setRadio(radio);
                circulo.setNombre(nombre);
                circulo.calcularAreaCirculo();
                System.out.printf("Figura: %s\nÁrea: %.2f", nombre.toUpperCase(), circulo.getAreaCirculo());
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
}
