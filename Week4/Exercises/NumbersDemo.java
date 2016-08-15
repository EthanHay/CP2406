/**
 * Created by jc319762 on 15/08/16.
 */
public class NumbersDemo {
    public static void main(String[] args) {

        int a = 14, b = 33;

        displayTwiceTheNumber(a);
        displayNumberPlusFive(a);
        displayNumberSquared(a);

        displayTwiceTheNumber(b);
        displayNumberPlusFive(b);
        displayNumberSquared(b);

    }
    public static void displayTwiceTheNumber(int a) {
        System.out.println("Twice the number: " + (a*2));
    }
    public static void displayNumberPlusFive(int a) {
        System.out.println("Number plus five: " + (a+5));
    }
    public static void displayNumberSquared(int a) {
        System.out.println("Number squared: " + (a * a));
    }
}
