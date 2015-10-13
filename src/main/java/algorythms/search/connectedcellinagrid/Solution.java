package algorythms.search.connectedcellinagrid;

import java.util.*;

public class Solution {

    protected static String getOutput(int[][] grid, int rows, int columns) {
        List<Set<String>> gridList = new ArrayList<>();
        int foundRow, foundColumn;
        do {
            foundRow = -1;
            foundColumn = -1;
            boolean found = false;
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    boolean isRegion = grid[row][column] == 1;
                    if (isRegion) {
                        foundRow = row;
                        foundColumn = column;
                        String coordinate = getCoordinateString(row, column);
                        for (Set<String> gridSet : gridList) {
                            if (hasNeighbour(gridSet, row, column, rows, columns)) {
                                grid[row][column] = 0;
                                gridSet.add(coordinate);
                                found = true;
                            }
                        }
                    }
                }
            }

            if (!found && foundRow >= 0 && foundColumn >= 0) {
                String coordinate = getCoordinate(foundRow, foundColumn, rows, columns);
                grid[foundRow][foundColumn] = 0;
                Set<String> gridSet = new HashSet<>();
                gridSet.add(coordinate);
                gridList.add(gridSet);
            }
        } while (foundRow >= 0 && foundColumn >= 0);

        int result = 0;
        for (Set<String> set : gridList) {
            result = Math.max(result, set.size());
        }

        return Integer.toString(result);
    }

    private static boolean hasNeighbour(Set<String> grid, int row, int column, int rows, int columns) {
        for (int neighbourRow = -1; neighbourRow <= 1; neighbourRow++) {
            for (int neighbourColumn = -1; neighbourColumn <= 1; neighbourColumn++) {
                if (neighbourRow != 0 || neighbourColumn != 0) {
                    if (grid.contains(getCoordinate(neighbourRow + row, neighbourColumn + column, rows, columns))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static String getCoordinate(int row, int column, int rows, int columns) {
        if (row >= 0 && column >= 0 && row < rows && column < columns) {
            return getCoordinateString(row, column);
        }
        return "";
    }

    private static String getCoordinateString(int row, int column) {
        return row + "-" + column;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int[][] grid = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                grid[row][column] = in.nextInt();
            }
        }
        System.out.println(Solution.getOutput(grid, rows, columns));
    }

}