package algorythms.skyscanner.employees;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(5);
        String expected = "";
        Assert.assertEquals(expected, actual);
    }

}
