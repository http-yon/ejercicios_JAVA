import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog(null, "ingrese numero");

        double residuo = Double.parseDouble(numero) % 2;

        if (residuo == 0) {
            JOptionPane.showMessageDialog(null, "es divisible entre 2");
        } else {
            JOptionPane.showMessageDialog(null, "no es divisible entre 2");
        }
    }
}
