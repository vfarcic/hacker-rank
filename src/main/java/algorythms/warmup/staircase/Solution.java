package algorythms.warmup.staircase;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int floors) {
        String output = "";
        for (int floor = floors; floor > 0; floor--) {
            for (int block = 1; block <= floors; block++) {
                if (block < floor) {
                    output += " ";
                } else {
                    output += "#";
                }
            }
            if (floor > 1) {
                output += "\n";
            }
        }
        return output;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(new Solution().getOutput(input));
    }

}