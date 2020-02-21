package arreglosdeberpoo;

public class EstudiantesArray {

    //Declaracion de variables
    private String [] nombre = new String[5];
    private String [] celular = new String[5];
    private String [] universidad = new String[5];
    private int [] edad = new int[5];
    private String cadena = "";

    /**
     * Metodo Constructor que recibe parametros del metodo principal
     * @param nombre
     * @param celular
     * @param universidad
     * @param edad
     */
    public EstudiantesArray(String[] nombre, String[] celular, String[]universidad,int[] edad){
        this.nombre = nombre;
        this.celular = celular;
        this.universidad = universidad;
        this.edad = edad;
    }
    /**
     * Metodo presentar que acumular los datos en una cadena
     * @return cadena
     */
    public String presentar(){
        for (int i = 0; i < nombre.length; i++) {
            cadena = String.format("%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s" +
                            "\n------------------------------",cadena,nombre[i],edad[i],universidad[i],celular[i]);
        }
        return cadena;
    }
}