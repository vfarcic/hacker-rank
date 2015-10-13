package algorythms.strings.biggerisgreater;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        String actual = Solution.getOutput("ab".toCharArray());
        String expected = "ba";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        String actual = Solution.getOutput("bb".toCharArray());
        String expected = "no answer";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput3() {
        String actual = Solution.getOutput("hefg".toCharArray());
        String expected = "hegf";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput4() {
        String actual = Solution.getOutput("dhck".toCharArray());
        String expected = "dhkc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput5() {
        String actual = Solution.getOutput("dkhc".toCharArray());
        String expected = "hcdk";
        Assert.assertEquals(expected, actual);
    }

}
