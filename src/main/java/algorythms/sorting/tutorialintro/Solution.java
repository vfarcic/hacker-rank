package algorythms.sorting.tutorialintro;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int value, int[] numbers) {
        int index = 0;
        while(numbers[index] < value) {
            index++;
        }
        return Integer.toString(index);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int[] numbers = new int[in.nextInt()];
        for (int t = 0; t < numbers.length; t++) {
            numbers[t] = in.nextInt();
        }
        System.out.println(Solution.getOutput(value, numbers));
    }

}