package algorythms.search.connectedcellinagrid;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput(new int[][]{
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 0}
        }, 4, 4);
        String expected = "5";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput(new int[][]{
                {1, 1, 1, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0}
        }, 7, 5);
        String expected = "9";
        Assert.assertEquals(expected, actual);
    }

}
