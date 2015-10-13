package algorythms.skyscanner.solution2;

import java.util.*;

public class Solution {

    static void OutputCommonManager(int count, Scanner in) {
        String employee1 = in.next();
        String employee2 = in.next();
        String[][] names = new String[count - 1][2];
        for (int index = 0; index < (count - 1); index++) {
            names[index][0] = in.next();
            names[index][1] = in.next();
        }
        System.out.println(getOutput(employee1, employee2, names));
    }

    static String getOutput(String employee1, String employee2, String[][] names) {
        Map<String, Integer> map = new TreeMap<>();
        for (int index = 0; index < names.length; index++) {
            String manager = names[index][0];
            String managed = names[index][1];
            if (manager.equals(employee1) || manager.equals(employee2)) {
                return manager;
            }
            if (map.size() == 0) {
                map.put(manager, 0);
            }
            int managerIndex = map.get(manager) + 1;
            map.put(managed, managerIndex);
        }
        int manager1Index = map.get(employee1);
        int manager2Index = map.get(employee2);
        int managerIndex = Math.min(manager1Index - 1, manager2Index - 1);
        for (String name : map.keySet()) {
            if (map.get(name) == managerIndex) {
                return name;
            }
        }
        return "";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _count;
        _count = Integer.parseInt(in.nextLine());

        OutputCommonManager(_count, in);

    }

}