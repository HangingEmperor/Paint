package testpaint;

public class TestPaint {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();

        /*Hago visible la ventana y le añado un addMouseListener que estara
        atento a todo lo que suceda respecto al mouse en la ventana. */
        ventana.setVisible(true);
        ventana.addMouseListener(ventana);

        /*Creo un hilo del objeto Ventana, que estara ejecutando el codigo hasta
        que termine. */
        Thread h1 = new Thread(ventana);
        h1.start();
    }
}
