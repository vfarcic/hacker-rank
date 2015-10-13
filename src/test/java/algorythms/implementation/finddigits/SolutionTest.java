package algorythms.implementation.finddigits;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput12() {
        String actual = Solution.getOutput("12");
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1012() {
        String actual = Solution.getOutput("1012");
        String expected = "3";
        Assert.assertEquals(expected, actual);
    }

}
