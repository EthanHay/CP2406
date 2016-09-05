// Sum and average an array of integers
public class DebugEight2 {
    public static void main(String args[]) {
        int[] someNums = {4, 17, 22, 8, 35};
        float tot = 0;
        float average;

        for (int x = 0; x < someNums.length; x++) {
            tot += someNums[x];
        }

        average = tot / someNums.length;

        System.out.println("Sum is " + tot);
        System.out.println("Average is " + average);
    }
}
