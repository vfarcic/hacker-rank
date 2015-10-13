package algorythms.implementation.caesarcypher;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutputAlpha() {
        String actual = Solution.getOutput(new char[]{'a', 'b', 'C'}, 2);
        String expected = "cdE";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputHyphen() {
        String actual = Solution.getOutput(new char[]{'a', 'b', '-'}, 2);
        String expected = "cd-";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputOver() {
        String actual = Solution.getOutput(new char[]{'a', 'z', 'Z'}, 2);
        String expected = "cbB";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput("middle-Outz".toCharArray(), 2);
        String expected = "okffng-Qwvb";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBigRotation() {
        String actual = Solution.getOutput("www.abc.xy".toCharArray(), 87);
        String expected = "fff.jkl.gh";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetZeroRotation() {
        String actual = Solution.getOutput("www.abc.xy".toCharArray(), 0);
        String expected = "www.abc.xy";
        Assert.assertEquals(expected, actual);
    }

}
