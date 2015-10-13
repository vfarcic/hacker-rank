package algorythms.implementation.chocolatefeast;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput(10, 2, 5);
        String expected = "6";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput(12, 4, 4);
        String expected = "3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput3() {
        String actual = Solution.getOutput(6, 2, 2);
        String expected = "5";
        Assert.assertEquals(expected, actual);
    }

}
