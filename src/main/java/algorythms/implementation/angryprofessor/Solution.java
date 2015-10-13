package algorythms.implementation.angryprofessor;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(int minStudents, int[] times) {
        int studentsOnTime = 0;
        for (int time : times) {
            if (time <= 0) {
                studentsOnTime++;
            }
        }
        return (studentsOnTime >= minStudents) ? "NO" : "YES";
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int test = 0; test < t; test++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] times = new int[n];
            for (int student = 0; student < n; student++) {
                times[student] = in.nextInt();
            }
            System.out.println(Solution.getOutput(k, times));
        }
    }

}