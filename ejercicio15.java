import javax.swing.JOptionPane;

public class ejercicio15 {
    public static void main(String[] args) {

        double numero = -1;

        do {
            String firstNum = JOptionPane.showInputDialog("ingresa un numero");
            numero = Float.parseFloat(firstNum);
        } while (numero != 0);
    }   
}
