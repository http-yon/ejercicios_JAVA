import javax.swing.JOptionPane;

public class ejercicio18 {
    public static void main(String[] args) {

        String numeroMinSt = JOptionPane.showInputDialog(null, "ingresa numero menor");
        String numeroMaxSt = JOptionPane.showInputDialog(null, "ingresa numero mayor");

        double numeroMin = Float.parseFloat(numeroMinSt);
        double numeroMax = Float.parseFloat(numeroMaxSt);

        for (int i = 10; i > 0; i--) {
            double numeroRandom = (int) ((Math.random() * (numeroMax - numeroMin)) + numeroMin);
            JOptionPane.showMessageDialog(null, "respuesta #" + i + ": " + numeroRandom);
        }

    }

}
