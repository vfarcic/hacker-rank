package algorythms.greedy.gridchallenge;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(char[][] grid) {
        int length = grid.length;
        for (int row = 0; row < length; row++) {
            for (int column = 1; column < length; column++) {
                char value = grid[row][column];
                int changeIndex = column - 1;
                while (changeIndex >= 0 && value < grid[row][changeIndex]) {
                    grid[row][changeIndex + 1] = grid[row][changeIndex];
                    grid[row][changeIndex] = value;
                    changeIndex--;
                }
            }
        }

        for (int column = 0; column < length; column++) {
            for (int row = 1; row < length; row++) {
                if (grid[row - 1][column] > grid[row][column]) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int gridSize = in.nextInt();
            char[][] grid = new char[gridSize][gridSize];
            for (int index = 0; index < gridSize; index++) {
                grid[index] = in.next().toCharArray();
            }
            System.out.println(Solution.getOutput(grid));
        }
    }

}