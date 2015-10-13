package algorythms.sorting.tutorialintro;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(4, new int[]{1, 4, 5, 7, 9, 12});
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputNegative() {
        String actual = Solution.getOutput(-1, new int[]{-3, -2, -1, 0, 1, 2});
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

}
