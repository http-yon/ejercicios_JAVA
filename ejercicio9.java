import javax.swing.JOptionPane;

public class ejercicio9 {
    public static void main(String[] args) {

        String precioSt = JOptionPane.showInputDialog(null, "ingrese precio (no iva)");
        double precio = Double.parseDouble(precioSt);

        //constante iva
        final double iva = 21;

        //sacamos el iva del producto
        double finalPrice = (iva * precio)/100;
        
        //precio + iva
        JOptionPane.showMessageDialog(null, "PRECIO TOTAL: " + (precio + finalPrice));        
    }
}
