import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(null, "input de prueba");

        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }
}
