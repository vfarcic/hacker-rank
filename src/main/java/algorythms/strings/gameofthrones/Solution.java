package algorythms.strings.gameofthrones;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(char[] password) {
        int allowedOddChars = 0;
        if (password.length % 2 == 1) {
            allowedOddChars = 1;
        }
        int[] counts = new int[26];
        for (char character : password) {
            counts[character - 'a']++;
        }
        int oddChars = 0;
        for (int count : counts) {
            if (count % 2 == 1) oddChars++;
        }
        return (oddChars == allowedOddChars) ? "YES" : "NO";
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(Solution.getOutput(in.next().toCharArray()));
    }

}