package arreglospoo;

public class DesviacionMedia {
    private double [] num = new double[15];
    private  double []desviacion = new double[15];
    private double promedio;
    private double acum;
    private String cadena = "Numero\t\tDesviacion\n";

    public DesviacionMedia(double [] numeros){
        num = numeros;
    }
    public double obtenerPromedio(){
        promedio = 0;
        acum = 0;
        for (int i = 0; i < num.length; i++) {
            acum = acum + num[i];
        }
        promedio = acum/ num.length;
        return promedio;
    }

    public double [] obtenerdesviacion(){
        for (int i = 0; i < num.length; i++) {
            desviacion[i] = num[i] - obtenerPromedio();
        }
        return  desviacion;
    }
    public String presentar(){
        for (int i = 0; i < num.length; i++) {
            cadena = String.format("%s%.2f\t\t%.2f\n",cadena,num[i],obtenerdesviacion()[i]);
        }
        cadena = String.format("%sMedia = \t%.2f",cadena,obtenerPromedio());
        return cadena;
    }
}
