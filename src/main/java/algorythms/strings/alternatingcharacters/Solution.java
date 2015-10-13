package algorythms.strings.alternatingcharacters;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(String word) {
        int length = word.length();
        while(word.contains("AA")) {
            word = word.replaceAll("AA", "A");
        }
        while(word.contains("BB")) {
            word = word.replaceAll("BB", "B");
        }
        return Integer.toString(length - word.length());
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(in.next()));
        }
    }

}