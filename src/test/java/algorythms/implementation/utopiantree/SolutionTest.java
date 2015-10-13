package algorythms.implementation.utopiantree;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput0() {
        String actual = Solution.getOutput(0);
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput(1);
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput4() {
        String actual = Solution.getOutput(4);
        String expected = "7";
        Assert.assertEquals(expected, actual);
    }

}
