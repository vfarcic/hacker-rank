package algorythms.strings.funnystring;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        int index = 1;
        boolean isFunny = true;
        while (index < word.length() && isFunny) {
            isFunny = hasFunnyChars(word, reverseWord, index);
            index++;
        }
        return isFunny ? "Funny": "Not Funny";
    }

    protected static boolean hasFunnyChars(String a, String b, int index) {
        int aResult = Math.abs(a.charAt(index) - a.charAt(index - 1));
        int bResult = Math.abs(b.charAt(index) - b.charAt(index - 1));
        return aResult == bResult;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(in.next()));
        }
    }

}