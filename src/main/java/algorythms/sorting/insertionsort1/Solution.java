package algorythms.sorting.insertionsort1;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] numbers) {
        String output = "";
        int index = numbers.length - 1;
        int value = numbers[index];
        while (index > 0 && value < numbers[index - 1]) {
            numbers[index] = numbers[index - 1];
            output += getLine(numbers) + "\n";
            index--;
        }
        numbers[index] = value;
        output += getLine(numbers);
        return output;
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