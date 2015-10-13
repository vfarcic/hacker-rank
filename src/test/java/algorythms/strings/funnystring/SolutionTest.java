package algorythms.strings.funnystring;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testHasFunnyCharsTrue() {
        boolean actual = Solution.hasFunnyChars("acxz", "zxca", 1);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasFunnyCharsFalse() {
        boolean actual = Solution.hasFunnyChars("bcxz", "zxcb", 3);
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputFunny() {
        String actual = Solution.getOutput("acxz");
        String expected = "Funny";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputNotFunny() {
        String actual = Solution.getOutput("bcxz");
        String expected = "Not Funny";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputOvyvzvptyvpvpxyztlrztsrztztqvrxtxuxq() {
        String actual = Solution.getOutput("ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq");
        String expected = "Funny";
        Assert.assertEquals(expected, actual);
    }

}
