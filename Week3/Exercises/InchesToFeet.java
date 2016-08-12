/**
 * Created by jc319762 on 12/08/16.
 */
public class InchesToFeet {
    public static void main(String[] args) {

        int inches = 86;
        int feet = inches / 12;
        int leftover = inches % 12;

        System.out.println(feet + " feet and " + leftover + " inches");
    }
}

