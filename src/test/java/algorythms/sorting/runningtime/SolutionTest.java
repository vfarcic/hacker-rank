package algorythms.sorting.runningtime;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(new int[]{2, 1, 3, 1, 2});
        String expected = "4";
        Assert.assertEquals(expected, actual);
    }

}
