package algorythms.warmup.extralongfactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    protected static String getOutput(int factorial) {
        BigInteger result = BigInteger.ONE;
        for (int multiplier = 2; multiplier <= factorial; multiplier++) {
            result = result.multiply(new BigInteger(Integer.toString(multiplier)));
        }
        return result.toString();
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(new Solution().getOutput(input));
    }

}