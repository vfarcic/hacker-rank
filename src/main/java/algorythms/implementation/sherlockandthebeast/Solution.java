package algorythms.implementation.sherlockandthebeast;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int t) {
        for (int fives = t; fives >= 0; fives--) {
            if ((fives % 3) == 0) {
                int threes = t - fives;
                if (threes % 5 == 0) {
                    return new String(new char[fives]).replace("\0", "5") +
                            new String(new char[threes]).replace("\0", "3");
                }
            }
        }
        return "-1";
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int index = 0; index < t; index++) {
            int n = in.nextInt();
            System.out.println(Solution.getOutput(n));
        }
    }

}