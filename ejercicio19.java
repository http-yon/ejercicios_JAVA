import javax.swing.JOptionPane;

public class ejercicio19 {
    public static void main(String[] args) {
        String numeroSt = JOptionPane.showInputDialog(null,"ingrese numero");
        double numero = Double.parseDouble(numeroSt);
        
        if (numero > 0) {
            
            for (char digitoChar : numeroSt.toCharArray()) {
                int digito = Character.getNumericValue(digitoChar);
                JOptionPane.showMessageDialog(null, "digito: " + digito);
            }
        }else{
            JOptionPane.showMessageDialog(null, "no se aceptan numeros menores o iguales a cero");
        }
    }
}
