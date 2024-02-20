import javax.swing.JOptionPane;

public class ejercicio7 {
    public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog(null, "ingrese una letra").charAt(0);
        JOptionPane.showMessageDialog(null, "resultado: " + (int) letra);
    }
}
