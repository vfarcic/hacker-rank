package algorythms.implementation.thegridsearch;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String[] grid = new String[]{
                "7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137"
        };
        String[] subGrid = new String[]{
                "9505",
                "3845",
                "3530"
        };
        String actual = Solution.getOutput(grid, subGrid);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String[] grid = new String[]{
                "400453592126560",
                "114213133098692",
                "474386082879648",
                "522356951189169",
                "887109450487496",
                "252802633388782",
                "502771484966748",
                "075975207693780",
                "511799789562806",
                "404007454272504",
                "549043809916080",
                "962410809534811",
                "445893523733475",
                "768705303214174",
                "650629270887160"
        };
        String[] subGrid = new String[]{
                "99",
                "99"
        };
        String actual = Solution.getOutput(grid, subGrid);
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputFoundOnTheFirstRow() {
        String[] grid = new String[]{
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137"
        };
        String[] subGrid = new String[]{
                "9505",
                "3845",
                "3530"
        };
        String actual = Solution.getOutput(grid, subGrid);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputFoundOnTheLastRow() {
        String[] grid = new String[]{
                "7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293"
        };
        String[] subGrid = new String[]{
                "9505",
                "3845",
                "3530"
        };
        String actual = Solution.getOutput(grid, subGrid);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputFoundOnTheFirstColumn() {
        String[] grid = new String[]{
                "3455864",
                "1158619",
                "8242643",
                "9505813",
                "3845374",
                "3530293",
                "0589324"
        };
        String[] subGrid = new String[]{
                "9505",
                "3845",
                "3530"
        };
        String actual = Solution.getOutput(grid, subGrid);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputFoundOnTheLastColumn() {
        String[] grid = new String[]{
                "7283455",
                "6731158",
                "8988242",
                "3830589",
                "2229505",
                "5633845",
                "6473530"
        };
        String[] subGrid = new String[]{
                "9505",
                "3845",
                "3530"
        };
        String actual = Solution.getOutput(grid, subGrid);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputFoundOnMultipleColumns() {
        String[] grid = new String[]{
                "72834553455",
                "67311581158",
                "89882428242",
                "38305890589",
                "22295059505",
                "56338453845",
                "64735313530"
        };
        String[] subGrid = new String[]{
                "9505",
                "3845",
                "3530"
        };
        String actual = Solution.getOutput(grid, subGrid);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }
}
