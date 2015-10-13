package algorythms.strings.makeitanagram;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput("cde", "abc");
        String expected = "4";
        Assert.assertEquals(expected, actual);
    }

}
