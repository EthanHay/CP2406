// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them

import java.util.*;

public class DebugSeven2 {
    public static void main(String[] args) {
        String str;
        String partStr;
        int x;
        int num;
        int lastSpace = 0;
        int sum = 0;

//      Scanner in = new Scanner(System.in);
//      System.out.print("Enter a series of integers separated by spaces >> ");
//      str = in.nextLine();
        str = "1 2 3 4 5 ";
        for (x = 0; x <= str.length() - 1; x++) {
            if (Character.toString(str.charAt(x)).equals(" ")) {
                partStr = str.substring(lastSpace, x);
                lastSpace = x + 1;
                num = Integer.parseInt(partStr);
                System.out.println("                " + num);
                sum += num;
            }
        }
//      partStr = str.substring(lastSpace + 1, length);
//      num = Integer.parseInt(partStr);
//      System.out.println("                " + num);
//      sum = num;
        System.out.println("         -------------------" +
                "\nThe sum of the integers is " + sum);
    }
}