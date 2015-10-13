package algorythms.warmup.simplearraysum;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return Integer.toString(sum);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        int[] numbersArray = new int[numbers];
        for (int number = 0; number < numbers; number++) {
            numbersArray[number] = in.nextInt();
        }
        System.out.println(new Solution().getOutput(numbersArray));
    }

}