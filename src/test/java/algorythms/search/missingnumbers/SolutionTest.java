package algorythms.search.missingnumbers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(
                new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206},
                new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204}
        );
        String expected = "204 205 206";
        Assert.assertEquals(expected, actual);
    }

}
