package algorythms.implementation.utopiantree;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int cycles) {
        int height = 1;
        for (int cycle = 1; cycle <= cycles; cycle++) {
            if (cycle % 2 == 0) {
                height++;
            } else {
                height *= 2;
            }
        }
        return Integer.toString(height);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(in.nextInt()));
        }
    }

}