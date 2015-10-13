package algorythms.implementation.cutthesticks;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput(new int[]{5, 4, 4, 2, 2, 8});
        String expected =
                "6\n" +
                "4\n" +
                "2\n" +
                "1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput(new int[]{1, 2, 3, 4, 3, 3, 2, 1});
        String expected =
                "8\n" +
                "6\n" +
                "4\n" +
                "1";
        Assert.assertEquals(expected, actual);
    }

}
