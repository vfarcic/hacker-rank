package algorythms.skyscanner.solution2;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput("Hilary", "James", new String[][] {
                {"Sarah", "Fred"},
                {"Sarah", "Paul"},
                {"Fred", "Hilary"},
                {"Fred", "Jenny"},
                {"Jenny", "James"}
        });
        String expected = "Fred";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput("Simon", "Claudiu", new String[][] {
                {"Sarah", "Claudiu"},
                {"Sarah", "Paul"},
                {"Claudiu", "Simon"}
        });
        String expected = "Claudiu";
        Assert.assertEquals(expected, actual);
    }

}
