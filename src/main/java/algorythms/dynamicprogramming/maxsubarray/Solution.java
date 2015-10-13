package algorythms.dynamicprogramming.maxsubarray;

import java.util.Scanner;

// TODO: Pending
public class Solution {

    protected static String getOutput(int[] numbers) {
        int length = numbers.length;
        int sum = 0;
        int positivesSum = 0;
        for (int index = 0; index < length; index++) {
            int number = numbers[index];
            if (number > 0) {
                positivesSum += number;
            }
            sum += number;
        }

        if (positivesSum == 0) {
            for (int index = 0; index < length; index++) {
                int number = numbers[index];
                if (positivesSum == 0) {
                    positivesSum = number;
                } else {
                    positivesSum = Math.max(positivesSum, number);
                }
            }
            sum = positivesSum;
        } else {
            int remove = 0;
            int lastRemovedIndex = 0;

            for (int index = 0; index < length - 1; index++) {
                remove += numbers[index];
                if ((sum + remove) < sum) {
                    sum -= remove;
                    remove = 0;
                    lastRemovedIndex = index;
                }
            }

            remove = 0;
            for (int index = (length - 1); index > lastRemovedIndex; index--) {
                remove += numbers[index];
                if ((sum + remove) < sum) {
                    sum -= remove;
                    remove = 0;
                }
            }
        }

        return sum + " " + positivesSum;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int length = in.nextInt();
            int[] numbers = new int[length];
            for (int index = 0; index < length; index++) {
                numbers[index] = in.nextInt();
            }
            System.out.println(Solution.getOutput(numbers));
        }
    }

}