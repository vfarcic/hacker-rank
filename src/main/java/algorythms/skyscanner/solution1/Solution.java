package algorythms.skyscanner.solution1;

import java.util.*;

public class Solution {

    static void OutputMostPopularDestination(int count, Scanner in) {
        Map<String, Integer> map = new HashMap<>();
        for (int index = 0; index < count; index++) {
            String destination = in.next();
            if (!map.containsKey(destination)) {
                map.put(destination, 0);
            }
            map.put(destination, map.get(destination) + 1);
        }
        int max = 0;
        String destination = "";
        for (String key : map.keySet()) {
            int sum = map.get(key);
            if (sum > max) {
                max = sum;
                destination = key;
            }
        }

        System.out.println(destination);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _count;
        _count = Integer.parseInt(in.nextLine());

        OutputMostPopularDestination(_count, in);
    }

}