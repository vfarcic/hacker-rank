package algorythms.warmup.solvemefirst;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int a, int b) {
        return Integer.toString(a + b);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(new Solution().getOutput(a, b));
    }
}