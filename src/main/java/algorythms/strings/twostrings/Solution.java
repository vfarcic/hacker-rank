package algorythms.strings.twostrings;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(java.util.Set<Character> a, java.util.Set<Character> b) {
        for (char character : a) {
            if (b.contains(character)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(convertToSet(in.next()), convertToSet(in.next())));
        }
    }

    public static java.util.Set<Character> convertToSet(String string) {
        java.util.Set resultSet = new java.util.HashSet();
        for (int i = 0; i < string.length(); i++) {
            resultSet.add(new Character(string.charAt(i)));
        }
        return resultSet;
    }

}