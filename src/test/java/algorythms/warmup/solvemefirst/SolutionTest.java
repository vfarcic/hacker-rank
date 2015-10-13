package algorythms.warmup.solvemefirst;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(5, 7);
        String expected = "12";
        Assert.assertEquals(expected, actual);
    }

}
