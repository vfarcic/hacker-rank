package algorythms.warmup.diagonaldifference;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[][] numbers) {
        int length = numbers.length;
        int sum1 = 0;
        int sum2 = 0;
        for (int index = 0; index < length; index++) {
            sum1 += numbers[index][index];
            sum2 += numbers[index][length - index - 1];
        }
        return Integer.toString(Math.abs(sum1 - sum2));
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        int[][] numbersArray = new int[numbers][numbers];
        for (int y = 0; y < numbers; y++) {
            for (int x = 0; x < numbers; x++) {
                numbersArray[y][x] = in.nextInt();
            }
        }
        System.out.println(new Solution().getOutput(numbersArray));
    }

}