package algorythms.warmup.libraryfine;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testBeforeDate() {
        String actual = Solution.getOutput(3, 6, 2015, 6, 6, 2015);
        String expected = "0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOnDate() {
        String actual = Solution.getOutput(6, 6, 2015, 6, 6, 2015);
        String expected = "0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSameMonth() {
        String actual = Solution.getOutput(9, 6, 2015, 6, 6, 2015);
        String expected = Integer.toString(3 * 15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSameYear() {
        String actual = Solution.getOutput(13, 8, 2015, 6, 6, 2015);
        String expected = Integer.toString(2 * 500);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDifferentYear() {
        String actual = Solution.getOutput(13, 8, 2025, 6, 6, 2015);
        String expected = Integer.toString(10000);
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testGetOutput() {
//        String actual = Solution.getOutput(9, 6, 2015, 6, 6, 2015);
//        int expected = 45;
//        Assert.assertEquals(expected, actual);
//    }

}
