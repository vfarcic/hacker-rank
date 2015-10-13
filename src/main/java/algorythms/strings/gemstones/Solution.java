package algorythms.strings.gemstones;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(String[] rocks) {
        java.util.List<java.util.Set<Character>> rocksList = new java.util.ArrayList<>();
        java.util.Set<Character> elements = new java.util.HashSet<>();

        for (String rock : rocks) {
            char[] rockChars = rock.toCharArray();
            java.util.Set<Character> rockSet = new java.util.HashSet<>();
            for (char rockChar : rockChars) {
                rockSet.add(rockChar);
                elements.add(rockChar);
            }
            rocksList.add(rockSet);
        }

        int counter = 0;
        for (Character element : elements) {
            boolean found = true;
            for (java.util.Set<Character> rock : rocksList) {
                if (!rock.contains(element)) {
                    found = false;
                    break;
                }
            }
            if (found) counter++;
        }
        return Integer.toString(counter);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String[] rocks = new String[length];
        for (int index = 0; index < length; index++) {
            rocks[index] = in.next();
        }
        System.out.println(Solution.getOutput(rocks));
    }

}