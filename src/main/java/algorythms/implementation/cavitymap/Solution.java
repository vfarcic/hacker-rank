package algorythms.implementation.cavitymap;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(char[][] grid) {
        int gridSize = grid.length;
        String output = "";

        for (int vIndex = 1; vIndex < (gridSize - 1); vIndex++) {
            for (int hIndex = 1; hIndex < (gridSize - 1); hIndex++) {
                int number = (int) grid[vIndex][hIndex];
                char up = grid[vIndex - 1][hIndex];
                char down = grid[vIndex + 1][hIndex];
                char left = grid[vIndex][hIndex - 1];
                char right = grid[vIndex][hIndex + 1];
                if (
                        up != 'X' && up < number &&
                        down != 'X' && down < number &&
                        left != 'X' && left < number &&
                        right != 'X' && right < number
                ) {
                    grid[vIndex][hIndex] = 'X';
                }
            }
        }
        for (int index = 0; index < gridSize; index++) {
            output += new String(grid[index]) + "\n";
        }
        return output.trim();
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int gridSize = in.nextInt();
        char[][] grid = new char[gridSize][gridSize];
        for (int verticalIndex = 0; verticalIndex < gridSize; verticalIndex++) {
            grid[verticalIndex] = in.next().toCharArray();
        }
        System.out.println(Solution.getOutput(grid));
    }

}