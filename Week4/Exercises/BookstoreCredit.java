import javax.swing.JOptionPane;
/**
 * Created by jc319762 on 15/08/16.
 */
public class BookstoreCredit {
    public static void main(String[] args) {

        String name, gpa;

        name = JOptionPane.showInputDialog(null, "Please enter your name");
        gpa = JOptionPane.showInputDialog(null, "Please enter your gpa");

        getCredits(name, Double.parseDouble(gpa));

    }
    public static void getCredits(String name, double gpa) {
        System.out.println(name +",  GPA: "+ gpa +",  Credits: " +(gpa*10));

    }
}
