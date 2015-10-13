package algorythms.sorting.insertionsort2;

import algorythms.sorting.insertionsort1.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(new int[]{1, 4, 3, 5, 6, 2});
        String expected =
                "1 4 3 5 6 2\n" +
                "1 3 4 5 6 2\n" +
                "1 3 4 5 6 2\n" +
                "1 3 4 5 6 2\n" +
                "1 2 3 4 5 6";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAlreadySorted() {
        String actual = Solution.getOutput(new int[]{1, 2, 3, 4});
        String expected =
                "1 2 3 4\n" +
                "1 2 3 4\n" +
                "1 2 3 4";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstMisplaced() {
        String actual = Solution.getOutput(new int[]{2, 1, 3, 4});
        String expected =
                "1 2 3 4\n" +
                "1 2 3 4\n" +
                "1 2 3 4";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLastMisplaced() {
        String actual = Solution.getOutput(new int[]{1, 2, 4, 3});
        String expected =
                "1 2 4 3\n" +
                "1 2 4 3\n" +
                "1 2 3 4";
        Assert.assertEquals(expected, actual);
    }

}
