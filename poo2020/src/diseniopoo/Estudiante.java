package diseniopoo;

public class Estudiante {

    // Creacion de variables globales
    private String nombre;
    private String materia;
    private double nota1;
    private double nota2;
    private double promedio;

    /**
     * Creacion del constructor con los siguientes atributos:
     * @param nombre
     * @param materia
     * @param nota1
     * @param nota2
     */
    public Estudiante(String nombre, String materia, double nota1, double nota2){
        this.setNombre(nombre);
        this.setMateria(materia);
        this.setNota1(nota1);
        this.setNota2(nota2);
        setPromedio((this.getNota1() + this.getNota2()));
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
     /**
     * Metodo para calcular el estado de la materia
     * @return cadena
     */
    public String Estado(){
        String cadena = "";
        if (getPromedio() >= 27.5){
            cadena = "Aprobado";
        } else {
            cadena = "Supletorio";
        }
        return cadena;
    }
     /**
     * Metodo para concatenar el mensaje que se mostrara en pantalla
     * @return cadena
     */
    public String mensaje(){
        String cadena = String.format("Nombre: %s\nMateria: %s\nPrimer Bimestre: %.2f\n" +
                        "Segundo Bimestre: %.2f\nPromedio: %.2f (%s).", getNombre(), getMateria(), getNota1(),
                getNota2(), getPromedio(), Estado());
        return cadena;
    }
}