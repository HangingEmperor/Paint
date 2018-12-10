package testpaint;

import java.awt.Color;
import java.awt.Graphics;

public class CuadradoGrafico extends Cuadrado implements FiguraGrafico {

    private Punto punto;
    private Color color;

    public CuadradoGrafico(Punto punto, Color color, double lado) {
        super(lado);
        this.punto = punto;
        this.color = color;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Punto getPunto() {
        return punto;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(this.getPunto().getX(), this.getPunto().getY(), (int) this.getLado(), (int) this.getLado());
    }

}
