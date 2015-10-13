package algorythms.implementation.chocolatefeast;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int money, int price, int wrappersForChocolate) {
        int chocolates = (int) Math.floor(money / price);
        int wrappers = chocolates;
        while (wrappers >= wrappersForChocolate) {
            int additionalChocolates = (int) Math.floor(wrappers / wrappersForChocolate);
            wrappers = wrappers % wrappersForChocolate;
            chocolates += additionalChocolates;
            wrappers += additionalChocolates;
        }
        return Integer.toString(chocolates);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int money = in.nextInt();
            int price = in.nextInt();
            int wrappers = in.nextInt();
            System.out.println(Solution.getOutput(money, price, wrappers));
        }
    }

}