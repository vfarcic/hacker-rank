package algorythms.warmup.verybigsum;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(long[] numbers) {
        long sum = 0;
        for (long number : numbers) {
            sum += number;
        }
        return Long.toString(sum);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        long[] numbersArray = new long[numbers];
        for (int index = 0; index < numbers; index++) {
            numbersArray[index] = in.nextLong();
        }
        System.out.println(new Solution().getOutput(numbersArray));
    }

}