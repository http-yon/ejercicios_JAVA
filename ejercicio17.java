import javax.swing.JOptionPane;

public class ejercicio17 {
    public static void main(String[] args) {
        String diaSt = JOptionPane.showInputDialog(null, "ingrese el dia de la semana");

        String dia = diaSt.toLowerCase();
        
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                JOptionPane.showMessageDialog(null, "es dia laboral");
                break;
        
            case "sabado":
            case "domingo":
                JOptionPane.showMessageDialog(null, "no es dia laboral");
            default:
                break;
        }

    }
}
