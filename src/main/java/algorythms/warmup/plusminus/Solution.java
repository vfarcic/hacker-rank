package algorythms.warmup.plusminus;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] numbers) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int number : numbers) {
            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        float length = numbers.length;
        return String.format(
                "%.3f\n%.3f\n%.3f",
                (positives / length),
                (negatives / length),
                (zeros / length)
        );
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
            numbers[index] = in.nextInt();
        }
        System.out.println(getOutput(numbers));
    }

}