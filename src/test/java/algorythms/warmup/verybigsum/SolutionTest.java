package algorythms.warmup.verybigsum;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(
                new long[]{1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l}
        );
        String expected = "5000000015";
        Assert.assertEquals(expected, actual);
    }

}
