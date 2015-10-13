package algorythms.warmup.staircase;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(6);
        String expected =
                "     #\n" +
                "    ##\n" +
                "   ###\n" +
                "  ####\n" +
                " #####\n" +
                "######";
        Assert.assertEquals(expected, actual);
    }

}
