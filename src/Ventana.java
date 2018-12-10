package testpaint;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Ventana extends JFrame implements Runnable, MouseListener {

    private Color color = Color.BLACK;
    private double tamaño = 20;
    public int figura = 0;

    public JPanel panelTitulo, panelAutor, panelColores, panelFiguras,
            panelTamaño;
    public JLabel labelTitulo, labelAutor, labelColores, labelFiguras,
            labelTamaño;
    public JButton buttonRojo, buttonAzul, buttonCyan, buttonGreen,
            buttonMorado, buttonNaranja, buttonAmarillo, buttonRosa,
            buttonFiguras, buttonTamaño;

    /*Al llamar al constructor ejecuto todos los componentes que lleva el JFrame.*/
    public Ventana() {
        setVentana();
        setPanels();
        setLabels();
        setButtons();
    }

    /*Declara un tamaño estandar de ventana y con setExtendedState(), hago que 
    la ventana se ponga automaticamente en pantalla completa. Con setLayout(null),
    lo hago para poder colocar JPanels.*/
    private void setVentana() {
        setSize(600, 600);
        setTitle("Ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.white);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(null);
    }

    @Override
    public void run() {
    }

    /* Al momento en que el usuario haga click en cualquier seccion de la ventana,
    que no contenga un panel ya establecido en esa area de la ventana, creara un
    panel para el JPanel donde creara un objeto para la clase Dibujar, la clase
    Dibujar hara la figura segun la solicitada y sera devuelta como un "Panel" y
    se añadira despues con add() en el JFrame. */
    @Override
    public void mouseClicked(MouseEvent e) {
        Dibujar panelDibujo = new Dibujar(figura, color, tamaño);
        panelDibujo.setBounds(e.getX() - 10, e.getY() - 30, (int) tamaño, (int) tamaño);
        this.add(panelDibujo);
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void setPanels() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        panelTitulo = new JPanel();
        panelTitulo.setBounds(0, 0, screenSize.width / 3, 50);
        panelTitulo.setBackground(Color.orange);
        this.getContentPane().add(panelTitulo);

        panelAutor = new JPanel();
        panelAutor.setBounds(0, screenSize.height - screenSize.height / 8, screenSize.width / 4, screenSize.height);
        panelAutor.setBackground(Color.BLACK);
        this.getContentPane().add(panelAutor);

        panelColores = new JPanel();
        panelColores.setBounds(0, 50, screenSize.width / 3, 30);
        panelColores.setBackground(Color.GRAY);
        this.getContentPane().add(panelColores);

        panelFiguras = new JPanel();
        panelFiguras.setBounds(0, 80, screenSize.width / 6, 40);
        panelFiguras.setBackground(Color.DARK_GRAY);
        this.getContentPane().add(panelFiguras);

        panelTamaño = new JPanel();
        panelTamaño.setBounds(0, 120, screenSize.width / 6, 40);
        panelFiguras.setBackground(Color.DARK_GRAY);
        this.getContentPane().add(panelTamaño);
    }

    private void setLabels() {
        labelTitulo = new JLabel("Figuras");
        labelTitulo.setForeground(Color.WHITE);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        labelTitulo.setBounds(0, 0, 30, 30);
        panelTitulo.add(labelTitulo);

        labelAutor = new JLabel("Omar Flores - POO");
        labelAutor.setForeground(Color.WHITE);
        labelAutor.setBounds(0, 0, 30, 30);
        panelAutor.add(labelAutor);

        labelColores = new JLabel("Colores");
        labelColores.setForeground(Color.WHITE);
        labelColores.setBounds(80, 0, panelColores.getX(), panelColores.getY() / 6);
        panelColores.add(labelColores);

        labelFiguras = new JLabel("Figuras");
        labelFiguras.setForeground(Color.WHITE);
        panelFiguras.add(labelFiguras);

        labelTamaño = new JLabel("Tamaño");
        labelTamaño.setForeground(Color.BLACK);
        panelTamaño.add(labelTamaño);
    }

    public void setButtons() {
        buttonRojo = new JButton();
        buttonRojo.setOpaque(true);
        buttonRojo.setBackground(Color.RED);
        panelColores.add(buttonRojo);

        buttonAzul = new JButton();
        buttonAzul.setOpaque(true);
        buttonAzul.setBackground(Color.BLUE);
        panelColores.add(buttonAzul);

        buttonCyan = new JButton();
        buttonCyan.setOpaque(true);
        buttonCyan.setBackground(Color.CYAN);
        panelColores.add(buttonCyan);

        buttonGreen = new JButton();
        buttonGreen.setOpaque(true);
        buttonGreen.setBackground(Color.GREEN);
        panelColores.add(buttonGreen);

        buttonMorado = new JButton();
        buttonMorado.setOpaque(true);
        buttonMorado.setBackground(Color.MAGENTA);
        panelColores.add(buttonMorado);

        buttonNaranja = new JButton();
        buttonNaranja.setOpaque(true);
        buttonNaranja.setBackground(Color.ORANGE);
        panelColores.add(buttonNaranja);

        buttonAmarillo = new JButton();
        buttonAmarillo.setOpaque(true);
        buttonAmarillo.setBackground(Color.YELLOW);
        panelColores.add(buttonAmarillo);

        buttonRosa = new JButton();
        buttonRosa.setOpaque(true);
        buttonRosa.setBackground(Color.PINK);
        panelColores.add(buttonRosa);

        buttonFiguras = new JButton("Seleccionar figura");
        buttonFiguras.setOpaque(true);
        panelFiguras.add(buttonFiguras);

        buttonTamaño = new JButton("Ajustar tamaño");
        buttonTamaño.setOpaque(true);
        panelTamaño.add(buttonTamaño);

        interaccionButtons();
    }

    private void interaccionButtons() {
        buttonTamaño.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                String tamañoS = "";
                do {
                    tamañoS = JOptionPane.showInputDialog("Cantidad de pixeles: ");
                } while (!Check.isNumber(tamañoS));
                tamaño = Double.parseDouble(tamañoS);
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonFiguras.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Object[] figurasS = {"Circulo", "Cuadrado", "Rectangulo", "Triangulo"};
                int opc = JOptionPane.showOptionDialog(null,
                        "¿Que figura desea?:", "Figuras", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, figurasS, figurasS[0]);
                figura = opc + 1;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonRojo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.RED;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonAzul.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.BLUE;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonCyan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.CYAN;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonGreen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.GREEN;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonMorado.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.MAGENTA;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonNaranja.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.ORANGE;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonAmarillo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.YELLOW;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        buttonRosa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                color = Color.PINK;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
    }
}
