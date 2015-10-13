package algorythms.sorting.insertionsort2;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] numbers) {
        String output = "";
        for (int changeIndex = 1; changeIndex < numbers.length; changeIndex++) {
            reorder(numbers, changeIndex);
            output += getLine(numbers) + "\n";
        }
        return output.trim();
    }

    private static void reorder(final int[] numbers, final int changeIndex) {
        int index = changeIndex;
        int value = numbers[index];
        while (index > 0 && value < numbers[index - 1]) {
            numbers[index] = numbers[index - 1];
            index--;
        }
        numbers[index] = value;
    }

    private static String getLine(int[] numbers) {
        String line = "";
        for (int i = 0; i < numbers.length; i++) {
            line += numbers[i] + " ";
        }
        return line.trim();
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