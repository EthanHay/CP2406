import javax.swing.JOptionPane;
/**
 * Created by jc319762 on 12/08/16.
 */
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        String inches;
        int feet, leftover;
        // get input
        inches = JOptionPane.showInputDialog(null,"Please enter the number of inches you wish to convert");
        //process values
        feet = (Integer.parseInt(inches) / 12);
        leftover = (Integer.parseInt(inches) % 12);

        //Output
        JOptionPane.showMessageDialog(null,feet + " feet and " + leftover + " inches");
    }
}
