import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Created by jc319762 on 8/08/16.
 */
public class ChilliToGoProfit {
    public static void main(String[] args) {
        int mealAdult = 7;
        int mealChild = 4;
        double mealCostAdult = 4.35;
        double mealCostChild = 3.1;
        String soldAdults;
        String soldChilds;
        double totalAdults;
        double totalChilds;
        double totalAdultProfit;
        double totalChildProfit;
        DecimalFormat df = new DecimalFormat("#.##");

        soldAdults = JOptionPane.showInputDialog(null, "Enter the amount of adult meals sold", "");
        soldChilds = JOptionPane.showInputDialog(null, "Enter the amount of child meals sold", "");

        totalAdults = (mealAdult * Integer.parseInt(soldAdults));
        totalChilds = (mealChild * Integer.parseInt(soldChilds));
        totalAdultProfit = totalAdults - (mealCostAdult * Integer.parseInt(soldAdults));
        totalChildProfit = totalChilds - (mealCostChild * Integer.parseInt(soldChilds));

        JOptionPane.showMessageDialog(null,"Adult meal total:  $" + totalAdults +"\nChild meal total:  $" + totalChilds +"\nAll Meals Total:  $" + (totalAdults+totalChilds)+
                "\n \nAdult meal profit:  $" + df.format(totalAdultProfit) +"\nChild meal profit:  $" + df.format(totalChildProfit) +"\nAll Meals profit:  $" + df.format(totalAdultProfit+totalChildProfit));


    }
}
