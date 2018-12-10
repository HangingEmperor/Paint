package testpaint;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujar extends JPanel {

    private Color color;
    private double tamaño;
    public int figura = 0;

    public Dibujar(int figura, Color color, double tamaño) {
        this.figura = figura;
        this.color = color;
        this.tamaño = tamaño;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public double getTamaño() {
        return tamaño;
    }

    /*Al momento en que se llama al constructor el metodo paint() se ejecuta de
    manera automatica, es por ello que al invocarlo y darle los valores, este
    metodo se ejecuta y empieza a pintar. Se puede ver el dibujo ya que la clase
    Ventana es un JFrame, mientras que la clase Dibujar es un JPanel, entonces
    dibujo el JPanel y se lo mando al JFrame, gracias a ello se dibuja la figura.*/
    @Override
    public void paint(Graphics g) {
        switch (figura) {
            case 0:
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 10, 10);
                break;
            case 1:
                CirculoGrafico circuloG = new CirculoGrafico(new Punto(0, 0), this.getColor(), this.getTamaño());
                circuloG.dibujar(g);
                break;
            case 2:
                CuadradoGrafico cuadradoG = new CuadradoGrafico(new Punto(0, 0), this.getColor(), this.getTamaño());
                cuadradoG.dibujar(g);
                break;
            case 3:
                RectanguloGrafico rectanguloG = new RectanguloGrafico(new Punto(0, 0), this.getColor(), this.getTamaño(), this.getTamaño() / 2);
                rectanguloG.dibujar(g);
                break;
            case 4:
                TrianguloGrafico trianguloG = new TrianguloGrafico(new Punto(0, 0), this.getColor(), this.getTamaño());
                trianguloG.dibujar(g);
                break;
        }
    }
}
