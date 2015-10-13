package algorythms.warmup.timeconversion;

import java.text.ParseException;
import java.util.Scanner;

public class Solution {

    protected static String getOutput(String time) {
        if (time.length() == 8) {
            time += "AM";
        }
        java.util.Date date = null;
        try {
            date = new java.text.SimpleDateFormat("hh:mm:ssaa").parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new java.text.SimpleDateFormat("HH:mm:ss").format(date);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(new Solution().getOutput(input));
    }

}