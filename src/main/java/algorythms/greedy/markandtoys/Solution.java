package algorythms.greedy.markandtoys;

import java.util.*;

public class Solution {

    protected static String getOutput(Map<Integer, Integer> toys, int money) {
        int bought = 0;
        for (int price : toys.keySet()) {
            int count = toys.get(price);
            for (int counter = 0; counter < count; counter++) {
                if (money - price < 0) {
                    return Integer.toString(bought);
                }
                bought++;
                money -= price;
            }
        }
        return Integer.toString(bought);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int toysCount = in.nextInt();
        int money = in.nextInt();
        Map<Integer, Integer> toys = new TreeMap<>();
        for (int toy = 0; toy < toysCount; toy++) {
            int price = in.nextInt();
            int count = 1;
            if (toys.containsKey(price)) {
                count += 1;
            }
            toys.put(price, count);
        }
        System.out.println(Solution.getOutput(toys, money));
    }

}