package algorythms.implementation.finddigits;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(String number) {
        int matches = 0;
        int intNumber = Integer.parseInt(number);
        int digits = number.length();
        for (int digit = 0; digit < digits; digit++) {
            int digitNumber = Character.getNumericValue(number.charAt(digit));
            if (digitNumber > 0 && intNumber % digitNumber == 0) {
                matches++;
            }
        }
        return Integer.toString(matches);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(in.next()));
        }
    }

}