import javax.swing.JOptionPane;

public class ejercicio16 {
    public static void main(String[] args) {

        String contraseña = "yohanpedraza123";
        String attempt = "";

        float intentos = 3;

        while (intentos > 0) {
            attempt = JOptionPane.showInputDialog(null, "ingrese contraseña");

            if (attempt.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "ENHORABUENA!!!");
                intentos = 1;
            }

            intentos--;
        }

        if (!attempt.equals(contraseña)) {
            JOptionPane.showMessageDialog(null, "total de intentos agotados, intentelo nuevamente mas tarde");
        }
    }

}
