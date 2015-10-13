package algorythms.strings.alternatingcharacters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutputAaaa() {
        String actual = Solution.getOutput("AAAA");
        String expected = "3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputBbbbb() {
        String actual = Solution.getOutput("BBBBB");
        String expected = "4";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput0() {
        String actual = Solution.getOutput("ABABABAB");
        String expected = "0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputBothLetters() {
        String actual = Solution.getOutput("AAABBB");
        String expected = "4";
        Assert.assertEquals(expected, actual);
    }

}
