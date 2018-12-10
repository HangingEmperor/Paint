package testpaint;

import java.awt.Color;
import java.awt.Graphics;

public class CirculoGrafico extends Circulo implements FiguraGrafico {

    private Punto punto;
    private Color color;

    public CirculoGrafico(double radio) {
        super(radio);
    }

    public CirculoGrafico(Punto punto, Color color, double radio) {
        super(radio);
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
        g.fillOval(this.getPunto().getX(), this.getPunto().getY(), (int) this.getRadio(), (int) this.getRadio());
    }

}
