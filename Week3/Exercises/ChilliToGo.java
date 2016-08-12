/**
 * Created by Ethan on 8/08/16.
 */
import javax.swing.JOptionPane;
public class ChilliToGo {
    public static void main(String[] args) {
        int mealAdult = 7;
        int mealChild = 4;
        String soldAdults;
        String soldChilds;
        double totalAdults;
        double totalChilds;

        soldAdults = JOptionPane.showInputDialog(null, "Enter the amount of adult meals sold", "");
        soldChilds = JOptionPane.showInputDialog(null, "Enter the amount of child meals sold", "");

        totalAdults = (mealAdult * Integer.parseInt(soldAdults));
        totalChilds = (mealChild * Integer.parseInt(soldChilds));

        JOptionPane.showMessageDialog(null,"Adult meal total:  $" + totalAdults +"\nChild meal total:  $" + totalChilds +"\nAll Meals Total:  $" + (totalAdults+totalChilds));


    }
}
