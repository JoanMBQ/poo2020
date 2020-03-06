package polimorfismo_deudores;

public class PrestamoHipotecario extends Deudores {
    private double interesM;

    public PrestamoHipotecario(String nombre, double capital, double plazos, String numeroC) {
        this.nombre = nombre;
        this.capital = capital;
        this.plazos = plazos;
        this.numeroC = numeroC;
    }

    @Override
    public void calcularInteres() {
        double meses = plazos * 12;
        double i = 0.25 / 100;
        double a = 1 + i;
        interesM = capital * (Math.pow(a, meses) * i / (Math.pow(a, meses) - 1));
        totalInteres = (interesM * meses) - capital;
    }
}