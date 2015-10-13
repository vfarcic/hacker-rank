package algorythms.sorting.insertionsort1;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(new int[]{2, 4, 6, 8, 3});
        String expected =
                "2 4 6 8 8\n" +
                "2 4 6 6 8\n" +
                "2 4 4 6 8\n" +
                "2 3 4 6 8";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSingleElementArray() {
        String actual = Solution.getOutput(new int[]{2});
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValueSmallest() {
        String actual = Solution.getOutput(new int[]{2, 3, 1});
        String expected =
                "2 3 3\n" +
                "2 2 3\n" +
                "1 2 3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValueBiggest() {
        String actual = Solution.getOutput(new int[]{1, 2, 3});
        String expected =
                "1 2 3";
        Assert.assertEquals(expected, actual);
    }

}
