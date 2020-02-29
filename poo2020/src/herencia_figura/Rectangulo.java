package herencia_figura;

public class Rectangulo extends Figura {

    // Atributos propios de la clase
    private double baseRecta;
    private double alturaRecta;
    private double areaRecta;

    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    public double getAreaRecta() {
        return areaRecta;
    }

    public void calcularAreaRecta() {
        areaRecta = baseRecta * alturaRecta;
    }
}
