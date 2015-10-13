package algorythms.warmup.extralongfactorials;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(25);
        String expected = "15511210043330985984000000";
        Assert.assertEquals(expected, actual);
    }

}
