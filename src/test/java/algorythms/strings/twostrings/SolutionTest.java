package algorythms.strings.twostrings;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput(
                Solution.convertToSet("hello"),
                Solution.convertToSet("world"));
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput(
                Solution.convertToSet("hi"),
                Solution.convertToSet("world"));
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

}
