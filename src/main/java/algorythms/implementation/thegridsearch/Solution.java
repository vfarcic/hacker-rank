package algorythms.implementation.thegridsearch;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(String[] grid, String subGrid[]) {
        int gridLength = grid.length;
        int subGridLength = subGrid.length;
        for (int row = 0; row <= (gridLength - subGridLength); row++) {
            int matrixIndex = grid[row].indexOf(subGrid[0]);
            while (matrixIndex >= 0) {
                boolean found = true;
                for (int subGridRow = 1; subGridRow < subGridLength; subGridRow++) {
                    if (grid[row + subGridRow].indexOf(subGrid[subGridRow], matrixIndex) != matrixIndex) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return "YES";
                } else {
                    matrixIndex = grid[row].indexOf(subGrid[0], matrixIndex + 1);
                }
            }
        }
        return "NO";
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int rows = in.nextInt();
            int columns = in.nextInt();
            String[] grid = new String[rows];
            for (int index = 0; index < rows; index++) {
                grid[index] = in.next();
            }
            int subRows = in.nextInt();
            int subColumns = in.nextInt();
            String[] subGrid = new String[subRows];
            for (int index = 0; index < subRows; index++) {
                subGrid[index] = in.next();
            }
            System.out.println("GRID: " + grid.length);
            System.out.println("SUBGRID: " + subGrid.length);
            System.out.println(Solution.getOutput(grid, subGrid));
        }
    }

}