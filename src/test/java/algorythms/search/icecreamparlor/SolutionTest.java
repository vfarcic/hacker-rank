package algorythms.search.icecreamparlor;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1And4() {
        String actual = Solution.getOutput(4, new int[]{1, 4, 5, 3, 2});
        String expected = "1 4";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1And2() {
        String actual = Solution.getOutput(4, new int[]{2, 2, 4, 3});
        String expected = "1 2";
        Assert.assertEquals(expected, actual);
    }

}
