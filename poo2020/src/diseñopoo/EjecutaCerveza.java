package diseñopoo;

import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de la cerveza:");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de la cerveza:");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese el costo:");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese el número de unidades vedidas");
        int unidades_vendidaes = teclado.nextInt();
        Cerveza cerveza = new Cerveza(precio, unidades_vendidaes, nombre, tipo);
        System.out.println("----------------------------------------");
        System.out.println(cerveza.presentar());
        System.out.println("----------------------------------------");

        /*
        // Creacion del objeto, con inicializacion de variables
        Cerveza cerveza = new Cerveza(1.40, 10, "Pilsener", "Personal");
        System.out.format("----------------------------------------\nTotal de ganancias por venta de cervezas: " +
                "\nNombre: %s \nTipo: %s \nPrecio: %2f \nUnidades vendidas: %d \nTotal Ventas: %2f \n" +
                        "----------------------------------------",
                cerveza.getNombre(), cerveza.getTipo(), cerveza.getPrecio(), cerveza.getUnidades_vendidas(),
                cerveza.calcularVentas());
         */
    }
}
