import javax.swing.JOptionPane;

public class ejercicio14 {
    public static void main(String[] args) {

        double a, b, c;

        String aSt = JOptionPane.showInputDialog(null,"ingrese variable a: ");
        String bSt = JOptionPane.showInputDialog(null,"ingrese variable b: ");
        String cSt = JOptionPane.showInputDialog(null,"ingrese variable c: ");

        a = Double.parseDouble(aSt);
        b = Double.parseDouble(bSt);
        c = Double.parseDouble(cSt);


        double discriminante = Math.pow(b,2) - 4*a*c;

        double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
        double x2 = ((b*(-1))-Math.sqrt(discriminante))/(2*a);


        System.out.println(">>" + discriminante);
        System.out.println("valor de x1: " + x1);
        System.out.println("valor de x2: " + x2);


        

    }
}
