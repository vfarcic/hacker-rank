package algorythms.dynamicprogramming.fibonaccimodified;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    protected static String getOutput(BigInteger first, BigInteger second, int n) {
        for (int current = 3; current <= n; current++) {
            BigInteger next = getNext(first, second);
            first = second;
            second = next;
        }
        return second.toString();
    }

    protected static BigInteger getNext(BigInteger a, BigInteger b) {
        return b.pow(2).add(a);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        BigInteger first = in.nextBigInteger();
        BigInteger second = in.nextBigInteger();
        int n = in.nextInt();
        System.out.println(Solution.getOutput(first, second, n));
    }

}