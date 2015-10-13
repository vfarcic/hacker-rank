package algorythms.implementation.sherlockandsquares;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int from, int to) {
        int result = (int)(Math.floor(Math.sqrt(to)) - Math.ceil(Math.sqrt(from)) + 1);
        return Integer.toString(result);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(in.nextInt(), in.nextInt()));
        }
    }

}