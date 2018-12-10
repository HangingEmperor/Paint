package testpaint;

public class Rectangulo implements Figura {

    private double ladoX;
    private double ladoY;

    public Rectangulo(double ladoX, double ladoY) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
    }

    public void setLadoX(double ladoX) {
        this.ladoX = ladoX;
    }

    public void setLadoY(double ladoY) {
        this.ladoY = ladoY;
    }

    public double getLadoX() {
        return ladoX;
    }

    public double getLadoY() {
        return ladoY;
    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
