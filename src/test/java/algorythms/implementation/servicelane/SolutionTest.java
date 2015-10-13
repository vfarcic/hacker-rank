package algorythms.implementation.servicelane;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private int lanes1[] = new int[]{2, 3, 1, 2, 3, 2, 3, 4};
    private int lanes2[] = new int[]{1, 2, 2, 2, 1};

    @Test
    public void testGetOutput1from0To3() {
        String actual = Solution.getOutput(lanes1, 0, 3);
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1from4To6() {
        String actual = Solution.getOutput(lanes1, 4, 6);
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1from6To7() {
        String actual = Solution.getOutput(lanes1, 6, 7);
        String expected = "3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1from3To5() {
        String actual = Solution.getOutput(lanes1, 3, 5);
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput1from0To7() {
        String actual = Solution.getOutput(lanes1, 0, 7);
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2from2To3() {
        String actual = Solution.getOutput(lanes2, 2, 3);
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2from1To4() {
        String actual = Solution.getOutput(lanes2, 1, 4);
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2from2To4() {
        String actual = Solution.getOutput(lanes2, 2, 4);
        String expected = "1";
        Assert.assertEquals(expected, actual);
    }

}
