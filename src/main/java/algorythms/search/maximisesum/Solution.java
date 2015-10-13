package algorythms.search.maximisesum;

import java.util.Scanner;

// TODO: Pending
public class Solution {

    protected static String getOutput(int[] numbers, int modulo) {
        return Integer.toString(0);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int length = in.nextInt();
            int modulo = in.nextInt();
            int[] numbers = new int[length];
            for (int index = 0; index < length; index++) {
                numbers[index] = in.nextInt();
            }
            System.out.println(Solution.getOutput(numbers, modulo));
        }
    }

}