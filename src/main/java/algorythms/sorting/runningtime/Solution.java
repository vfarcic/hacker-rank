package algorythms.sorting.runningtime;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] numbers) {
        int shifts = 0;
        for (int changeIndex = 1; changeIndex < numbers.length; changeIndex++) {
            shifts += reorder(numbers, changeIndex);
        }
        return Integer.toString(shifts);
    }

    private static int reorder(final int[] numbers, final int changeIndex) {
        int shifts = 0;
        int index = changeIndex;
        int value = numbers[index];
        while (index > 0 && value < numbers[index - 1]) {
            numbers[index] = numbers[index - 1];
            index--;
            shifts++;
        }
        numbers[index] = value;
        return shifts;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
            numbers[index] = in.nextInt();
        }
        System.out.println(Solution.getOutput(numbers));
    }

}