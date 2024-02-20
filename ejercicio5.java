import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main(String[]args){

        String radio = JOptionPane.showInputDialog(null,"INGRESE EL RADIO DEL CIRCULO");

        double radioAlCuadrado = Math.pow(Double.parseDouble(radio), 2);
        double area = Math.PI * radioAlCuadrado;

        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
        
    }
}
