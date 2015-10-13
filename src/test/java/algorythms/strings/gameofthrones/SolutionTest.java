package algorythms.strings.gameofthrones;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput("aaabbbb".toCharArray());
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput("cdefghmnopqrstuvw".toCharArray());
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput3() {
        String actual = Solution.getOutput("cdcdcdcdeeeef".toCharArray());
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

}
