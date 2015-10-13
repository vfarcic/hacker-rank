package algorythms.strings.anagram;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput("aaabbb".toCharArray());
        String expected = "3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput("ab".toCharArray());
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput3() {
        String actual = Solution.getOutput("abc".toCharArray());
        String expected = "-1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput4() {
        String actual = Solution.getOutput("mnop".toCharArray());
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput5() {
        String actual = Solution.getOutput("xyyx".toCharArray());
        String expected = "0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput6() {
        String actual = Solution.getOutput("xaxbbbxx".toCharArray());
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

}
