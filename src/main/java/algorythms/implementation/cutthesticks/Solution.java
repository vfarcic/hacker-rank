package algorythms.implementation.cutthesticks;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] sticks) {
        return cutSticks(sticks).trim();
    }

    private static String cutSticks(int[] sticks) {
        String output = "";
        int smallestStick = 0;
        int sticksCounter = 0;
        for (int index = 0; index < sticks.length; index++) {
            int length = sticks[index];
            if (length > 0) {
                sticksCounter++;
            }
            if (smallestStick > 0 && length > 0) {
                smallestStick = Math.min(smallestStick, length);
            } else {
                smallestStick = Math.max(smallestStick, length);
            }
        }
        for (int index = 0; index < sticks.length; index++) {
            sticks[index] = sticks[index] - smallestStick;
        }
        if (smallestStick > 0) {
            output += sticksCounter + "\n" + cutSticks(sticks);
        }
        return output;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] sticks = new int[size];
        for (int index = 0; index < size; index++) {
            sticks[index] = in.nextInt();
        }
        System.out.println(Solution.getOutput(sticks));
    }

}