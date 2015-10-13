package algorythms.implementation.servicelane;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int[] lanes, int from, int to) {
        int carType = 3;
        for (int index = from; index <= to; index++) {
            carType = Math.min(carType, lanes[index]);
            if (carType == 1) break;
        }
        return Integer.toString(carType);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] lanes = new int[in.nextInt()];
        int tests = in.nextInt();
        for (int lane = 0; lane < lanes.length; lane++) {
            lanes[lane] = in.nextInt();
        }
        for (int t = 0; t < tests; t++) {
            System.out.println(Solution.getOutput(lanes, in.nextInt(), in.nextInt()));
        }
    }

}