package algorythms.strings.makeitanagram;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(String a, String b) {
        int[] aChars = new int[26];
        int[] bChars = new int[26];
        boolean[] chars = new boolean[26];
        int toRemove = 0;

        for (char character : a.toCharArray()) {
            aChars[character - 'a']++;
            chars[character - 'a'] = true;
        }
        for (char character : b.toCharArray()) {
            bChars[character - 'a']++;
            chars[character - 'a'] = true;
        }
        for (int index = 0; index < 26; index++) {
            toRemove += Math.abs(aChars[index] - bChars[index]);
        }

        return Integer.toString(toRemove);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(Solution.getOutput(a, b));
    }

}