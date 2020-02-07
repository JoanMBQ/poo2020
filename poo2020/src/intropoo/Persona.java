package intropoo;

public class Persona {
    private String genero;
    private String religion;
    private String nombre;
    private int edad;

    /**
     * Método Constructor de la clase Persona
     * @param genero
     * @param religion
     * @param nombre
     * @param edad
     */
    public Persona(String genero, String religion, String nombre, int edad) {
        this.setGenero(genero);
        this.setReligion(religion);
        this.setNombre(nombre);
        this.setEdad(edad);
    }
    public Persona(String genero, String religion, int edad){
        this.genero = genero;
        this.religion = religion;
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
