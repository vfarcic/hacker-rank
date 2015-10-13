package algorythms.search.sherlockandarray;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] numbers) {
        int index = getMiddleIndex(numbers);
        int leftSum = getLeftSum(numbers, index);
        int rightSum = getRightSum(numbers, index);
        int currentNumber = numbers[index];
        while (leftSum < rightSum) {
            leftSum += currentNumber;
            index++;
            currentNumber = numbers[index];
            rightSum -= currentNumber;
        }
        while (leftSum > rightSum) {
            rightSum += currentNumber;
            index--;
            currentNumber = numbers[index];
            leftSum -= currentNumber;
        }
        if (leftSum == rightSum) return "YES";
        return "NO";
    }

    protected static int getLeftSum(int[] numbers, int until) {
        int sum = 0;
        for (int index = 0; index < until; index++) {
            sum += numbers[index];
        }
        return sum;
    }

    protected static int getRightSum(int[] numbers, int from) {
        int length = numbers.length;
        int sum = 0;
        for (int index = from + 1; index < length; index++) {
            sum += numbers[index];
        }
        return sum;
    }

    protected static int getMiddleIndex(int[] numbers) {
        return numbers.length / 2;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int length = in.nextInt();
            int[] numbers = new int[length];
            for (int index = 0; index < length; index++) {
                numbers[index] = in.nextInt();
            }
            System.out.println(Solution.getOutput(numbers));
        }
    }

}