package algorythms.strings.pangrams;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testIsPangramTrue() {
        boolean actual = Solution.isPangram("The quick brown fox jumps over the lazy dog");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsPangramFalse() {
        boolean actual = Solution.isPangram("The quick brown fox jumps over the lazy");
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputPangram() {
        String actual = Solution.getOutput("We promptly judged antique ivory buckles for the next prize");
        String expected = "pangram";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputNotPangram() {
        String actual = Solution.getOutput("We promptly judged antique ivory buckles for the prize");
        String expected = "not pangram";
        Assert.assertEquals(expected, actual);
    }

}
