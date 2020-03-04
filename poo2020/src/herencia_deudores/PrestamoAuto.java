package herencia_deudores;

public class PrestamoAuto extends  Deudores{
    private double interesM, total;

    public PrestamoAuto(String nombre, double capital, double plazos, String numeroC) {
        this.nombre = nombre;
        this.capital= capital;
        this.plazos = plazos;
        this.numeroC = numeroC;
    }

    public double calcularInteresAuto(){
        double meses = plazos * 12;
        double f = 6.5 / 12;
        double i = f / 100;
        double a = 1 + i;
        interesM = capital* (Math.pow(a, meses) * i / (Math.pow(a, meses)-1));
        return interesM;
    }
    public double totalInteres(){
        double meses = plazos * 12;
        total = (calcularInteresAuto() * meses) - capital;
        return total;
    }
}