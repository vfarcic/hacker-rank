package algorythms.warmup.timeconversion;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput("07:05:45PM");
        String expected = "19:05:45";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMidnightAm() {
        String actual = Solution.getOutput("00:00:00AM");
        String expected = "00:00:00";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMidnight() {
        String actual = Solution.getOutput("00:00:00");
        String expected = "00:00:00";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNoon() {
        String actual = Solution.getOutput("12:00:00PM");
        String expected = "12:00:00";
        Assert.assertEquals(expected, actual);
    }

}
