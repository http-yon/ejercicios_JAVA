import javax.swing.JOptionPane;

public class ejercicio8 {
    public static void main(String[] args) {
        
        String numero = JOptionPane.showInputDialog(null, "ingrese el numero");
        int numeroConv = Integer.parseInt(numero); 

        JOptionPane.showMessageDialog(null, "la letra es: " + (char)numeroConv);

    }
}
