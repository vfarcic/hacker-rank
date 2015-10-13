package algorythms.warmup.simplearraysum;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(new int[]{1, 2, 3, 4, 5, 6});
        String expected = "21";
        Assert.assertEquals(expected, actual);
    }

}
