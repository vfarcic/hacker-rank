package algorythms.search.icecreamparlor;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int amount, int[] numbers) {
        int length = numbers.length;
        for (int outerIndex = 0; outerIndex < (length - 1); outerIndex++) {
            int firstPrice = numbers[outerIndex];
            for (int index = outerIndex + 1; index < length; index++) {
                int price = numbers[index];
                if (firstPrice + price == amount) {
                    return (outerIndex + 1) + " " + (index + 1);
                }
            }
        }
        return "-1";
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int amount = in.nextInt();
            int length = in.nextInt();
            int[] numbers = new int[length];
            for (int index = 0; index < length; index++) {
                numbers[index] = in.nextInt();
            }
            System.out.println(Solution.getOutput(amount, numbers));
        }
    }

}