package testpaint;

import javax.swing.JOptionPane;

public class Check {

    public static Boolean isNumber(String number) {
        if (number.isEmpty()) {
            return false;
        }
        if (!number.matches("[+]?[0-9]*[.]?[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Entrada de números no válida.");
            return false;
        }
        if (Integer.parseInt(number) > 500) {
            JOptionPane.showMessageDialog(null, "La cantidad de píxeles es demasiada grande.");
        }
        if (Integer.parseInt(number) < 5) {
            JOptionPane.showMessageDialog(null, "La cantidad de píxeles es demasiado pequeña.");
        }
        return true;
    }
}
