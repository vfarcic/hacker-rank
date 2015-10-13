package algorythms.implementation.sherlockandsquares;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput3To9() {
        String actual = Solution.getOutput(3, 9);
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput17To24() {
        String actual = Solution.getOutput(17, 24);
        String expected = "0";
        Assert.assertEquals(expected, actual);
    }

}
