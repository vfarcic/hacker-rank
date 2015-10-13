package algorythms.warmup.solvemesecond;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int a, int b) {
        return Integer.toString(a + b);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        for (int line = 0; line < lines; line++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Solution.getOutput(a, b));
        }
    }

}