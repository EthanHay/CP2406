import javax.swing.JOptionPane;
/**
 * Created by jc319762 on 15/08/16.
 */
public class Billing {
    static double taxPercent = 0.08;
    public static void main(String[] args) {
        double bookPrice;
        int quantity, couponValue;

        //bookPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price for the item"));
        //quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity of items"));
        //couponValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the coupon discount percentage"));
        bookPrice = 19.95;
        quantity = 50;
        couponValue = 25;
        double singleparamtest = computeBill(bookPrice);
        double doubleparamtest = computeBill(bookPrice,quantity);
        double tripleparamtest = computeBill(bookPrice,quantity,couponValue);

        System.out.println("Single Parameter: " + singleparamtest);
        System.out.println("Double Parameter: " + doubleparamtest);
        System.out.println("Triple Parameter: " + tripleparamtest);

    }
    private static double computeBill(double price) {
        double tax = price * taxPercent;
        return price + tax;
    }
    private static double computeBill(double price,int quantity) {
        double tax = price * taxPercent;
        return (price + tax) * quantity;
    }
    private static double computeBill(double price, int quantity, int couponValue) {
        double tax = price * taxPercent;
        double discount = (double)couponValue / 100;
        return ((price + tax) * quantity) * discount;
    }

}
