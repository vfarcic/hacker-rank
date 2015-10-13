package algorythms.warmup.diagonaldifference;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        int[][] numbers = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        String actual = Solution.getOutput(numbers);
        String expected = "15";
        Assert.assertEquals(expected, actual);
    }

}
