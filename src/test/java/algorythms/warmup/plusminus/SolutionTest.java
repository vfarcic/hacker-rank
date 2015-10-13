package algorythms.warmup.plusminus;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        int[] numbers = {-4, 3, -9, 0, 4, 1};
        String actual = Solution.getOutput(numbers);
        String expected = "0.500\n0.333\n0.167";
        Assert.assertEquals(expected, actual);
    }

}
