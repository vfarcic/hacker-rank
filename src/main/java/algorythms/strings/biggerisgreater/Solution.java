package algorythms.strings.biggerisgreater;

import java.util.Scanner;

// TODO: Pending
public class Solution {

    protected static String getOutput(final char[] word) {
        return "no answer";
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(in.next().toCharArray()));
        }
    }

}