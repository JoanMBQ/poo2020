package polimorfismofigura;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int opcion = 0;
        boolean band = true;

        do {
            System.out.println("Ingrese el nombre de la figura: triangulo/cuadrado/rectangulo/circulo");
            nombre = entrada.nextLine();
            if (nombre.equals("Triangulo")|| nombre.equals("triangulo")){
                System.out.println("Ingrese la base del triangulo:");
                double baseT = entrada.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                double alturaT = entrada.nextDouble();
                Triangulo3 triangulo = new Triangulo3(baseT, alturaT, nombre);
                triangulo.calcularArea();
                System.out.printf("El area del %s es %.3f\n", triangulo.getNombreF(), triangulo.getArea());
            }else{
                if (nombre.equals("Cuadrado")|| nombre.equals("cuadrado")){
                    System.out.println("Ingrese un lado del cuadrado");
                    double ladoC = entrada.nextDouble();
                    Cuadrado3 cuadrado = new Cuadrado3(ladoC, nombre);
                    cuadrado.calcularArea();
                    System.out.printf("El area del %s es %.3f\n", cuadrado.getNombreF(), cuadrado.getArea());

                }else{
                    if (nombre.equals("Circulo")||nombre.equals("circulo")){
                        System.out.println("Ingrese el radio del circulo:");
                        double radio = entrada.nextDouble();
                        Circulo3 circulo = new Circulo3(radio, nombre);
                        circulo.calcularArea();
                        System.out.printf("El area del %s es %.3f\n", circulo.getNombreF(), circulo.getArea());

                    }else{
                        if (nombre.equals("Rectangulo")|| nombre.equals("rectangulo")){
                            System.out.println("Ingrese la base del rectangulo");
                            double baseR = entrada.nextDouble();
                            System.out.println("Ingrese la altura del rectangulo");
                            double alturaR = entrada.nextDouble();
                            Rectangulo3 rectangulo = new Rectangulo3(baseR,alturaR,nombre);
                            rectangulo.calcularArea();
                            System.out.printf("El area del %s es %.3f\n", rectangulo.getNombreF(),
                                    rectangulo.getArea());

                        }
                    }
                }
            }
            System.out.printf("Desea Ingresar otra figura\n1. Si\n2. No\n");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 2){
                band = false;
            }
        }while (band);

    }
}