package algorythms.greedy.jimandtheorders;

import java.util.*;

public class Solution {

    protected static String getOutput(Map<Integer, List<Integer>> orders) {
        String output = "";
        for (List<Integer> list : orders.values()) {
            for (int order : list) {
                output += order + " ";
            }
        }
        return output.trim();
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        Map<Integer, List<Integer>> orders = new TreeMap<>();
        for (int order = 1; order <= length; order++) {
            int time = in.nextInt() + in.nextInt();
            if (!orders.containsKey(time)) {
                orders.put(time, new LinkedList<Integer>());
            }
            orders.get(time).add(order);
        }
        System.out.println(Solution.getOutput(orders));
    }

}