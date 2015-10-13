package algorythms.search.missingnumbers;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] a, int[] b) {
        java.util.Map<Integer, Integer[]> map = new java.util.TreeMap<>();

        putNumbers(a, 0, map);
        putNumbers(b, 1, map);

        String output = "";
        for(int number : map.keySet()) {
            Integer[] counts = map.get(number);
            int diff = counts[1] - counts[0];
            if (diff > 0) {
                output += number + " ";
            }
        }

        return output.trim();
    }

    private static void putNumbers(int[] numbers, int collectionIndex, java.util.Map<Integer, Integer[]> map) {
        int aLength = numbers.length;
        for (int index = 0; index < aLength; index++) {
            int number = numbers[index];
            if (!map.containsKey(number)) {
                map.put(number, new Integer[]{0, 0});
            }
            map.get(number)[collectionIndex] += 1;
        }
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int aLength = in.nextInt();
        int[] a = new int[aLength];
        for (int index = 0; index < aLength; index++) {
            a[index] = in.nextInt();
        }
        int bLength = in.nextInt();
        int[] b = new int[bLength];
        for (int index = 0; index < bLength; index++) {
            b[index] = in.nextInt();
        }
        System.out.println(Solution.getOutput(a, b));
    }

}