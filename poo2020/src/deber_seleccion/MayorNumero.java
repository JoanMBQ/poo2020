
package deber_seleccion;

public class MayorNumero {
    // Declaracion de variables
    private double numA;
    private double numB;
    private double numC;
    private double numD;
    private double numMax;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getNumC() {
        return numC;
    }

    public void setNumC(double numC) {
        this.numC = numC;
    }

    public double getNumD() {
        return numD;
    }

    public void setNumD(double numD) {
        this.numD = numD;
    }

    public double getNumMax() {
        return numMax;
    }

    public void setNumMax(double numMax) {
        this.numMax = numMax;
    }
    /**
     * Metodo constructor del objeto Numero
     * @param numA
     * @param numB
     * @param numC
     * @param numD
     */
    public MayorNumero(double numA, double numB, double numC, double numD){
        this.setNumA(numA);
        this.setNumB(numB);
        this.setNumC(numC);
        this.setNumD(numD);
    }
    /**
     * metodo para obtener el mayoy numero
     * @return numMax
     */
    public double calcularMayor(){
        if(getNumA() > getNumB() && getNumA() > getNumC() && getNumA() > getNumD()){
            setNumMax(getNumA());
        } else if(getNumB() > getNumC() && getNumB() > getNumD()){
            setNumMax(getNumB());
        } else if(getNumC() > getNumD()){
            setNumMax(getNumC());
        } else{
            setNumMax(getNumD());
        }
        return getNumMax();
    }
    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String mensaje(){
        String cadena = String.format("El mayor numero es: %.2f",calcularMayor());
        return cadena;
    }
}