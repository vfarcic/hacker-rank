package algorythms.dynamicprogramming.maxsubarray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutputPositives() {
        String actual = Solution.getOutput(new int[]{1, 2, 3, 4});
        String expected = "10 10";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputStartsWithNegative() {
        String actual = Solution.getOutput(new int[]{-2, 1, -3, 2, 3, 4, -5});
        String expected = "9 10";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputNegatives() {
        String actual = Solution.getOutput(new int[]{2, -1, 2, 3, 4, -5});
        String expected = "10 11";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllNegatives() {
        String actual = Solution.getOutput(new int[]{-1, -2, -3, -4, -5, -6});
        String expected = "-1 -1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput(new int[]{1});
        String expected = "1 1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput(new int[]{1, -2});
        String expected = "1 1";
        Assert.assertEquals(expected, actual);
    }

}
