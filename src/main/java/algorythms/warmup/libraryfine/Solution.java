package algorythms.warmup.libraryfine;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(
            int actualDay,
            int actualMonth,
            int actualYear,
            int expectedDay,
            int expectedMonth,
            int expectedYear
    ) {
        int debt = 0;
        if (actualYear > expectedYear) {
            debt = 10000;
        } else if (actualYear == expectedYear) {
            if (actualMonth > expectedMonth) {
                debt = 500 * (actualMonth - expectedMonth);
            } else if (actualMonth == expectedMonth && actualDay > expectedDay) {
                debt = 15 * (actualDay - expectedDay);
            }
        }
        return Integer.toString(debt);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(new Solution().getOutput(
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt()
        ));
    }

}