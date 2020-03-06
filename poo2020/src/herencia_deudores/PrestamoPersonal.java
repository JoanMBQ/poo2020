package herencia_deudores;

public class PrestamoPersonal extends Deudores {
    private double interesM, totalInteres;

    public PrestamoPersonal(String nombre, double capital, double plazos, String numeroC) {
        this.nombre = nombre;
        this.capital= capital;
        this.plazos = plazos;
        this.numeroC = numeroC;
    }
    public double calcularInteresPersonal(){
        double meses = plazos * 12;
        double j = 11.07 / 12;
        double i = j / 100;
        double a = 1 + i;
        interesM = capital* (Math.pow(a, meses) * i / (Math.pow(a, meses)-1));
        totalInteres = (interesM * meses) - capital;
        return totalInteres;
    }

}