package algorythms.strings.gemstones;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(new String[]{
                "abcdde",
                "baccd",
                "eeabg"
        });
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

}
