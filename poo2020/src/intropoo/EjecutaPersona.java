package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        // Creacion del objeto, con inicializacion de variables
        Persona persona = new Persona("Masculino", "El bicho", "Joan Briceño", 19);
        System.out.println(persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Religión: "+persona.getReligion());
        System.out.println("Género: "+persona.getGenero());

        // Creación de objeto con constructor 2
        Persona persona2 = new Persona("Masculino", "Católico", 20);
        Persona persona3 = new Persona("Femenino", "La pulga", 18);
        System.out.println("Edad persona 2:"+persona2.getEdad());
        System.out.println("Edad persona 3:"+persona3.getEdad());
        System.out.println("Nombre persona 3:"+persona2.getNombre());
    }
}
