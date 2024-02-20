import javax.swing.JOptionPane;

public class ejercicio13 {
    public static void main(String[] args) {

        String totalVentaSt = JOptionPane.showInputDialog(null, "ingrese el total de ventas a registrar");
        float totalVentas = Float.parseFloat(totalVentaSt);

        float totalPrecioVentas = 0;

        while (totalVentas != 0) {

            String price = JOptionPane.showInputDialog(null, "ingrese precio de venta (" + totalVentas + ")");
            totalPrecioVentas = totalPrecioVentas + Float.parseFloat(price);

            totalVentas--;

        }
    }
}
